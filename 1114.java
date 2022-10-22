import java.util.Scanner;

public class 1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        boolean valid = false;
        
        while (valid != true) {
            
            int attempt = sc.nextInt();

            if (attempt == 2002) {
                valid = true;
            } else {
                System.out.println("Senha Invalida");
            }
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
