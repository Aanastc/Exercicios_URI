import java.util.Scanner;
public class 2221 {
    public static void main(String[] args) {

        Batalha b1 = new Batalha();
        }
    }
 class Batalha {
    Scanner q = new Scanner(System.in);
    private int nbatalhas;
    private int bonus;

    public Batalha() {
        nbatalhas = q.nextInt();
        for (int i = 0; i < nbatalhas; i++) {
            bonus = q.nextInt();
            int atk, def, lvl;

            atk = q.nextInt();
            def = q.nextInt();
            lvl = q.nextInt();
            Pomekon pikachu = new Pomekon(atk, def, lvl, bonus);
            Treinador t1 = new Treinador(lvl, "Dabriel");

            atk = q.nextInt();
            def = q.nextInt();
            lvl = q.nextInt();
            Pomekon toronto = new Pomekon(atk, def, lvl, bonus);
            Treinador t2 = new Treinador(lvl, "Guarte");

            if (pikachu.getSoma() > toronto.getSoma()) {
                System.out.println(t1.getNomeT());
            } else if (pikachu.getSoma() == toronto.getSoma()) {
                System.out.println("Empate");
            } else {
                System.out.println(t2.getNomeT());
            }

        }
    }

}
 class Pomekon {
    private int atkpmk;
    private int defesapmk;
    private int lvl;
    private int bonus;
    private double soma;

    public Pomekon(int atkpmk, int defesapmk, int lvl, int bonus){
        this.atkpmk = atkpmk;
        this.defesapmk = defesapmk;
        this.lvl = lvl;
        this.bonus = bonus;
        valorsoma();
    }

    public void valorsoma(){
      soma = (atkpmk + defesapmk) / 2;
      if(lvl % 2 == 0){
          soma += bonus;
      }
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public int getAtkpmk() {
        return atkpmk;
    }

    public int getBonus() {
        return bonus;
    }

    public int getDefesapmk() {
        return defesapmk;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setAtkpmk(int atkpmk) {
        this.atkpmk = atkpmk;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setDefesapmk(int defesapmk) {
        this.defesapmk = defesapmk;
    }
}
 class Treinador {
    private int lvl;
    private String nomeT;

    public Treinador(int lvl, String nomeT) {
        this.lvl = lvl;
        this.nomeT = nomeT;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getNomeT() {
        return nomeT;
    }

    public void setNomeT(String nomeT) {
        this.nomeT = nomeT;
    }
}