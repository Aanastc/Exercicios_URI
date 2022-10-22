import java.util.Scanner;

public class 1153 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(fatorial(N,1));

        sc.close();
    }

        public static int fatorial(int N, int fat) {
            if (N == 0) {
                return fat;
            }
            return fatorial(N-1, fat*N);
            
        }

    }