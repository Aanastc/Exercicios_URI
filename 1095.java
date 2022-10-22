import java.io.IOException;
import java.util.Scanner;

public class 1095 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
            int i=1;
            int j=60;
            
            while (j > 0){
                System.out.println("I=" + i + " " + "J=" + j);
                i = i + 3;
                j = j - 5;
         }
         System.out.println("I=" + i + " " + "J=" + j);
    }
}