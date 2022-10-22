import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class 1766 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        ArrayList<RenasList> cenarios = new ArrayList<>();

        for (int x = 0; x < t; x++) {
            int n = scanner.nextInt(); // total de renas
            int m = scanner.nextInt(); // número de renas que irão puxar o trenó
            RenasList renas = new RenasList();

            for (int j = 0; j < n; j++) {
                String s = scanner.next(); // nome
                int p = scanner.nextInt(); // peso
                int i = scanner.nextInt(); // idade
                float a = scanner.nextFloat(); // altura

                renas.add(new Rena(s, p, i, a));
            }

            renas.ordernar();

            RenasList renasTreno = renas.renasTreno(m);

            cenarios.add(renasTreno);
        }

        for (RenasList treno : cenarios) {
            System.out.println(String.format("CENARIO {%s}", cenarios.indexOf(treno) + 1));

            treno.mostrar();
        }

        scanner.close();
    }
}

class RenasList extends ArrayList<Rena> {
    public RenasList() {
        super();
    }

    public RenasList(List<Rena> subList) {
        super(subList);
    }

    public void ordernar() {
        this.sort(new SortRenas());
    }

    public RenasList renasTreno(int m) {
        return new RenasList(this.subList(0, m));
    }

    public void mostrar() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(String.format("%s - %s", i + 1, this.get(i).getName()));
        }
    }
}

class SortRenas implements Comparator<Rena> {
    public int compare(Rena a, Rena b) {
        if (a.getWeight() != b.getWeight()) {
            return ordernarPorPesso(a, b);
        }

        if (a.getAge() != b.getAge()) {
            return ordernarPorIdade(a, b);
        }

        if (a.getHeight() != b.getHeight()) {
            return ordernarPorAltura(a, b);
        }

        return ordernarPorNome(a, b);
    }

    public int ordernarPorPesso(Rena a, Rena b) {
        if (a.getWeight() > b.getWeight()) {
            return -1;
        }

        return 1;
    }

    public int ordernarPorIdade(Rena a, Rena b) {
        if (a.getAge() < b.getAge()) {
            return -1;
        }

        return 1;
    }

    public int ordernarPorAltura(Rena a, Rena b) {
        if (a.getHeight() < b.getHeight()) {
            return -1;
        }

        return 1;
    }

    public int ordernarPorNome(Rena a, Rena b) {
        return a.getName().compareTo(b.getName());
    }
}

class Rena {
    private String name;
    private int weight;
    private int age;
    private float height;

    public Rena(String name, int weight, int age, float height) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}