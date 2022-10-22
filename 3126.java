import java.util.Scanner;

public class 3126 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        ListaEncadeada<Integer> list = new ListaEncadeada<>();

        for (int i = 0; i < c; i++) {
            list.add(sc.nextInt());
        }

        int total = 0;

        for (int i = 0; i < list.size(); i++) {
            boolean joined = list.get(i) == 1;

            if (joined) {
                total++;
            }
        }

        System.out.println(total);

        sc.close();
    }
}

class ListaEncadeada<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

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