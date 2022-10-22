package Exercicios_URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 1028 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Integer> results = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            results.add(mdc(a, b));
        }

        for (Integer i : results) {
            System.out.println(i);
        }
        in.close();
    }

    public static int mdc(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return mdc(b, a % b);
    }
}