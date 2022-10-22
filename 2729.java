import java.util.Scanner;
import java.util.Comparator;

public class 2729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            ListaEncadeada<String> list = new ListaEncadeada<>();

            String[] itens = sc.nextLine().split(" ");

            for (String item : itens) {
                if (!list.contains(item)) {
                    list.add(item);
                }
            }

            list.sort((String a, String b) -> a.compareTo(b));

            System.out.println(list.toString().replaceAll(", ", " ").replaceAll("\\[|\\]", ""));
        }

        sc.close();
    }
}

class ListaEncadeada<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public void sort(Comparator<E> cond) {
        if (isEmpty() || size() == 1) {
            return;
        }

        Node<E> current = head;

        while (current != null) {
            Node<E> index = current.next;

            while (index != null) {
                if (cond.compare(current.element, index.element) > 0) {
                    E temp = current.element;
                    current.element = index.element;
                    index.element = temp;
                }

                index = index.next;
            }

            current = current.next;
        }
    }

    public void add(E e) {
        Node<E> node = new Node<E>(e);

        if (isEmpty()) {
            head = node;
        }

        if (size == 1) {
            head.next = node;
        }

        if (size > 1) {
            tail.next = node;
        }

        tail = node;
        size += 1;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }

        if (tail.element.equals(e)) {
            return true;
        }

        Node<E> current = head;
        boolean contains = false;

        while (current.next != null) {
            if (current.element.equals(e)) {
                contains = true;
                break;
            } else {
                current = current.next;
            }
        }

        return contains;
    }

    public E get(int i) {
        E element = null;
        int headIndex = 0;
        int tailIndex = size() - 1;

        if (isEmpty() || i > tailIndex) {
            System.out.println("Cannot get element from invalid index");

            return null;
        }

        if (i == headIndex) {
            return head.element;
        }

        if (i == tailIndex) {
            return tail.element;
        }

        Node<E> current = head.next;

        for (int j = 1; j < tailIndex; j++) {
            element = current.element;

            if (j == i) {
                break;
            } else {
                current = current.next;
            }
        }

        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        if (isEmpty()) {
            str.append("[]");

            return str.toString();
        }

        Node<E> current = head;

        str.append("[");

        while (current.next != null) {
            str.append(current.element);
            str.append(", ");

            current = current.next;
        }

        str.append(current.element);
        str.append("]");

        return str.toString();
    }
}

class Node<E> {
    public E element;
    public Node<E> next = null;

    public Node(E e) {
        element = e;
    }
}