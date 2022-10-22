package Exercicios_URI;
import java.util.Scanner;

public class 1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        PilhaDinamica<String> pilha = new PilhaDinamica<>();

        for (int i = 0; i < N; i++) {

            String diamante = "";

            diamante = sc.nextLine();
            diamante = diamante.replaceAll("[.]", "");
            pilha.push(diamante);
        }

        PilhaDinamica<Integer> valores = new PilhaDinamica<>();

        while (!pilha.isEmpty()) {

            int contaDiamante = 0;
            int troca = 1;
            String diamante = pilha.pop();

            while (troca == 1) {
                if (diamante.indexOf("<>") != -1) { // Se for diferente de -1 é pq existe o caracter.
                    contaDiamante++;
                    diamante = diamante.replaceFirst("<>", "");
                } else
                    troca = 0;
            }
            valores.push(contaDiamante);
        }

        while (!valores.isEmpty()) {
            Integer diamante = valores.pop();
            System.out.println(diamante);
        }

        sc.close();
    }
}

class Pilha<e> {
    public e elementos;
    public Pilha<e> next = null;

    public Pilha(e elementos) {
        this.elementos = elementos;
    }
}

class PilhaDinamica<e> {
    private Pilha<e> topo;
    public Pilha<e> next = null;
    private int tam = 0;

    public void push(e E) {
        Pilha<e> pilha = new Pilha<e>(E);

        pilha.next = topo;
        topo = pilha;
        tam++;
    }

    public e pop() {
        if (topo != null) {
            Pilha<e> item = topo;

            topo = topo.next;
            item.next = null;
            tam--;

            return item.elementos;
        }
        return null;
    }

    public boolean isEmpty() {
        return (topo == null);
    }

    Object peek() {
        // ver o ultimo elemento apenas
        return topo.elementos;
    }

    public void see() {
        Pilha<e> atual = topo;

        while (atual != null) {
            System.out.print(atual.elementos.toString() + " ");
            atual = atual.next;
        }
        System.out.println();
    }

    public int size() {
        return tam;
    }
}
