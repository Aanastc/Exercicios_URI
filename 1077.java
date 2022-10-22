package Exercicios_URI;
import java.util.Scanner;

public class 1077 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String posfixa = "";
            String expressao = sc.next();
            PilhaDinamica<Character> pilha = new PilhaDinamica<>();
            int cont = 0;
            char c;

            while (cont < expressao.length()) {
                c = expressao.charAt(cont);
                switch (c) {
                    case '*':
                    case '/':
                    case '+':
                    case '-':
                    case '^':
                        while ((!pilha.isEmpty()) && prioridade(c) <= prioridade(pilha.peek()))
                            posfixa += pilha.pop();

                        pilha.push(c);
                        break;

                    case '(':
                        pilha.push(c);
                        break;

                    case ')':
                        while (pilha.peek() != '(')
                            posfixa += pilha.pop();

                        if (pilha.peek() == '(')
                            pilha.pop();
                        break;

                    default:
                        posfixa += expressao.charAt(cont);
                        break;
                }
                cont++;
            }

            while (pilha.size() > 0) {
                if (pilha.peek() != '(')
                    posfixa += pilha.pop();
                else {
                    pilha.pop();
                }
            }
            System.out.println(posfixa);
        }
        sc.close();
    }

    public static int prioridade(char elemento) {

        int prioridade;

        switch (elemento) {
            case '+':
            case '-':
                prioridade = 1;
                break;
            case '*':
            case '/':
                prioridade = 2;
                break;
            case '^':
                prioridade = 3;
                break;
            default:
                prioridade = 0;
                break;
        }
        return prioridade;
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

    e peek() {
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