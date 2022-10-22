import java.io.IOException;
import java.util.Scanner;

public class 1961 {

    static class Sapo {
        private int pulo;

        public int getPulo() {
            return pulo;
        }

        public void setPulo(int pulo) {
            this.pulo = pulo;
        }
    }

    static class Tubo {
        private int altura;

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }
    }

    static class Jogo {
        private Tubo tubos[];
        private int nTubos;
        private int aPulo;

        public int getaPulo() {
            return aPulo;
        }

        public void setaPulo(int aPulo) {
            this.aPulo = aPulo;
        }

        public int getnTubos() {
            return nTubos;
        }

        public void play() {
            Scanner sc = new Scanner(System.in);
            // System.out.println("Digite altura do pulo: ");
            aPulo = sc.nextInt();
            // System.out.println("Digite o número de tubos: ");
            nTubos = sc.nextInt();
            // clearBuffer(sc);
            tubos = new Tubo[nTubos];
            Sapo sapo = new Sapo();
            sapo.setPulo(aPulo);
            for (int i = 0; i < getnTubos(); i++) {
                // System.out.println("Digite altura do tubo "+i+": ");
                int altura = sc.nextInt();
                // clearBuffer(sc);
                Tubo tubo = new Tubo();
                tubo.setAltura(altura);
                tubos[i] = tubo;
                if (i >= 1) {
                    if (sapo.getPulo() < Math.abs(tubos[i].getAltura() - tubos[i - 1].getAltura())) {
                        System.out.println("GAME OVER");
                        // sc.close();
                        return;
                    }
                }
            }
            System.out.println("YOU WIN");
            // sc.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Jogo jogo = new Jogo();
        jogo.play();
    }
}