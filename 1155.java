import java.io.IOException;

public class 1155 {

    public static void main(String[] args) throws IOException {
    	double S = 1;
    	for (int i = 2; i <= 100; i++) {
    		S += 1.00 / i;
    	}
    	System.out.println(String.format("%.2f", S));
    }
	
}