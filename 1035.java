import java.io.IOException;
import java.util.Scanner;

 public class 1035 {
      public static void main(String[] args) throws IOException{
       
       Scanner sc =  new Scanner(System.in);
       int A,B,C,D,somaCD,somaAB;
       
       A = sc.nextInt();
       B = sc.nextInt();
       C = sc.nextInt();
       D = sc.nextInt();
       
       somaCD = C + D;
       somaAB = A + B;
       
       if (B>C && D>A && somaCD > somaAB && C > 0 && D > 0){
           System.out.println("Valores aceitos");
       } else{
           System.out.println("Valores nao aceitos");
       }
       
     }
 }