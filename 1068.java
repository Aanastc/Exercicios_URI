import java.util.Scanner;

public class 1068 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            PilhaDinamica<Character> pilha = new PilhaDinamica<>();

            String expressao = sc.nextLine();
            int abertos = 0;
            boolean errado = false;
            for (int i = expressao.length() - 1; i >= 0; i--) {
                char caracter = expressao.charAt(i);
                pilha.push(caracter);
            }

            while (!pilha.isEmpty()) {
                char caracter = pilha.pop();

                if (caracter == ')') {
                    if (abertos == 0) {
                        errado = true;
                        break;
                    }
                    abertos--;
                } else if (caracter == '(') {
                    abertos++;
                }
            }

            if (errado || abertos > 0) {
                System.out.println("incorrect");
            } else {
                System.out.println("correct");
            }
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