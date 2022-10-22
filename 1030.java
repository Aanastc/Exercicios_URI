package Exercicios_URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 1030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nc = in.nextInt();
        List<Integer> seats = new ArrayList<Integer>();

        for (int i = 0; i < nc; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            seats.add(w(n, k));
        }

        for (int i = 0; i < seats.size(); i++) {
            System.out.println(String.format("Case %d: %d", i + 1, seats.get(i)));
        }

        in.close();
    }

    public static int w(int n, int k) {
        if (n == 1) {
            return 1;
        }

        return (w(n - 1, k) + k - 1) % n + 1;
    }
}