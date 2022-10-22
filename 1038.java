import java.util.Scanner;

public class 1038 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        int codigo = sc.nextInt();
        double qtd = sc.nextInt();
        double total = menu.items[codigo - 1].price * qtd;
        System.out.printf("Total: R$ %.2f\n", total);
        sc.close();

    }
}

class Item {
    public String specification;
    public Double price;
    public int code;

    public Item(String specification, Double price, int code) {
        this.specification = specification;
        this.price = price;
        this.code = code;
    }
}

class Menu {
    Item[] items = new Item[5];

    public Menu() {
        this.items[0] = new Item("Cachorro Quente", 4.00, 1);
        this.items[1] = new Item("X salada", 4.50, 2);
        this.items[2] = new Item("x bacon", 5.00, 3);
        this.items[3] = new Item("Torrada simples", 2.00, 4);
        this.items[4] = new Item("Refrigerante", 1.50, 5);
    }

}