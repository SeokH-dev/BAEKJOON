import java.util.Scanner;

class Node {
    int data;
    Node link;

    public Node(int n) {
        this.data = n;
        this.link = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int num) {
        Node newNode = new Node(num);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.link != null) {
                current = current.link;
            }
            current.link = newNode;
        }
    }

    public void sort() {
        for (Node change = head; change != null; change = change.link) {
            for (Node current = change; current != null; current = current.link) {
                if (change.data > current.data) {
                    int temp = change.data;
                    change.data = current.data;
                    current.data = temp;
                }
            }
        }
        // printAll();
    }

    public int get(int n) {
        Node current = head;
        int num = 0;
        while (num != n) {
            current = current.link;
            num++;
        }
        return current.data;
    }

    public int average() {
        Node current = head;
        int avg = 0;
        while (current != null) {
            avg += current.data;
            current = current.link;
        }
        return (avg / 5);
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.link;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            linkedList.add(scan.nextInt());
        }

        linkedList.sort();

        System.out.println(linkedList.average());
        System.out.println(linkedList.get(2));
    }
}