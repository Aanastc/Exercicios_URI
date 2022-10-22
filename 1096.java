public class 1096 {
    
    public static void main(String[] args) {
        
        int I = 1;
        int J = 7;

        while (I <= 9){
            
            int m = 0;
            while(m<3){
                System.out.println(String.format("I=%s J=%s", I, J));
            m++;
            J--;
  
            }

        I = I + 2;
        J = 7;

        }
    }
}
