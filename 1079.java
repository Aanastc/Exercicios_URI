import java.io.IOException;
import java.util.Scanner;

 public class 1079 {
     public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);

     int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    		double n1 = leitor.nextDouble();
    		double n2 = leitor.nextDouble();
    		double n3 = leitor.nextDouble();
    		double media = ((n1*2) + (n2*3) + (n3*5)) / 10;
    		System.out.println(String.format("%.1f", media));
    	}
	}
}