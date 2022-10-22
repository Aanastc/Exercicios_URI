import java.util.Scanner;
 
public class 1589 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        int[] sums = new int[t];
        int valor = 0;
 
        while (t > 0) {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
 
            sums[valor] = r1 + r2;
 
            t--;
            valor++;
        }
 
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);
        }
 
        sc.close();
    }
}
