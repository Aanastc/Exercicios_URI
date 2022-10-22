package Exercicios_URI;
import java.util.Scanner;

public class 1174{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float A[] = new float[100];

        for (int i=0; i < 100; i++) {
            A[i] = sc.nextFloat();
        }
        for (int i=0; i < 100; i++) {
            if (A[i] <= 10) {
                System.out.println("A[" + i + "] = " + A[i]);

            }
        }
        sc.close();
    }
}
