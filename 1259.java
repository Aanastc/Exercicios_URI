import java.util.Scanner;
import java.util.ArrayList;

public class 1259 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberList lista = new NumberList();
        Par par = new Par();
        ImPar impar = new ImPar();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            lista.add(new Number(sc.nextInt()));

        for (Number x : lista) {
            if (x.value % 2 == 0)
                par.add(x);
            else
                impar.add(x);
        }

        par.sort((Number a, Number b) -> a.value - b.value);
        impar.sort((Number a, Number b) -> b.value - a.value);

        par.print();
        impar.print();

        sc.close();
    }

}

class Number {
    public int value;

    public Number(int value) {
        this.value = value;
    }
}

class ImPar extends ArrayList<Number> {
    public void print() {
        for (Number z : this)
            System.out.println(z.value);
    }
}

class Par extends ArrayList<Number> {
    public void print() {
        for (Number y : this)
            System.out.println(y.value);
    }
}

class NumberList extends ArrayList<Number> {

}