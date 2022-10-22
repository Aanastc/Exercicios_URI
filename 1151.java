import java.util.Scanner;

class 1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n - 1; i++)

            System.out.print(fibo(i) + " ");
        System.out.println(fibo(n - 1));

        sc.close();
    }

    public static long fibo(int n) {
        int f = 0;
        int ant = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                f = 1;
                ant = 0;
            } else {
                f += ant;
                ant = f - ant;
            }
        }
        return f;
    }

}
