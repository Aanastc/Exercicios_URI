import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

public class 1258 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        List<Camiseta> camisetas = new ArrayList<>();
        String m = entrada.nextLine();
        int N = Integer.parseInt(m);

        while (N != 0) {

            while (N > 0) {
                camisetas.add(new Camiseta(entrada.nextLine(), entrada.next(), entrada.nextLine()));
                N--;
            }

            Collections.sort(camisetas, new CamisetaComparator());

            for (Camiseta x : camisetas) {
                System.out.printf("%s%s %s\n", x.getCorLogo(), x.getTamanho(), x.getNomeAluno());
            }

            m = entrada.nextLine();
            N = Integer.parseInt(m);

            if (N != 0) {
                System.out.print("\n");
            } else {
                break;
            }

            camisetas.clear();
        }

    }

}

class Camiseta {
    private String nomeAluno;
    private String tamanho;
    private String corLogo;

    public Camiseta() {

    }

    public Camiseta(String nomeAluno, String corLogo, String tamanho) {
        this.nomeAluno = nomeAluno;
        this.corLogo = corLogo;
        this.tamanho = tamanho;
    }

    public String getCorLogo() {
        return corLogo;
    }

    public void setCorLogo(String corLogo) {
        this.corLogo = corLogo;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}

class CamisetaComparator implements Comparator<Camiseta> {

    @Override
    public int compare(Camiseta c1, Camiseta c2) {
        int resultado = c1.getCorLogo().compareTo(c2.getCorLogo());

        if (resultado == 0) {
            resultado = c2.getTamanho().compareTo(c1.getTamanho());
            if (resultado == 0) {
                resultado = c1.getNomeAluno().compareTo(c2.getNomeAluno());
            }
        }

        return resultado;
    }
}
