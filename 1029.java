package Exercicios_URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 1029 {
    public static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        List<Integer> cases = new ArrayList<Integer>();

        for (int i = 0; i < t; i++) {
            cases.add(in.nextInt());
        }

        for (Integer n : cases) {
            int result = fib(n, false);

            System.out.println(String.format("fib(%d) = %d calls = %d", n, count, result));
        }

        in.close();
    }

    public static int fib(int n, boolean isRecursiveCall) {
        if (isRecursiveCall) {
            count += 1;
        } else {
            count = 0;
        }

        if (n < 2) {
            return n;
        }

        return fib(n - 1, true) + fib(n - 2, true);
    }
}