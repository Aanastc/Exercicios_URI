package Exercicios_URI;
import java.util.Scanner;

public class 1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X[] = new int[10];

        for (int i = 0; i < X.length; i++) {
            X[i] = sc.nextInt();
        }
        for (int i = 0; i < X.length; i++) {
            if (X[i] <= 0)
                X[i] = 1;
        }
        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
        sc.close();
    }

}
