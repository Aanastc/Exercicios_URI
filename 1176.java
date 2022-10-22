package Exercicios_URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class 1176 {
    public static HashMap<Integer, Long> fibMap = new HashMap<Integer, Long>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        List<Integer> cases = new ArrayList<Integer>();

        for (int i = 0; i < t; i++) {
            cases.add(in.nextInt());
        }

        for (Integer n : cases) {
            System.out.println(String.format("Fib(%d) = %d", n, fib(n)));
        }

        in.close();
    }

    public static long fib(int n) {
        if (fibMap.containsKey(n)) {
            return fibMap.get(n);
        }

        if (n == 0 || n == 1) {
            return n;
        }

        long nth = fib(n - 1) + fib(n - 2);

        fibMap.put(n, nth);

        return nth;
    }
}