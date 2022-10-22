package Exercicios_URI;
import java.util.Scanner;

public class 1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N[] = new int[20];
        int aux;

        for (int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }
        for (int i = 0; i < (N.length / 2); i++) {
            aux = N[i];
            N[i] = N[N.length - i - 1];
            N[N.length - i - 1] = aux;
        }
        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
        sc.close();
    }
}
