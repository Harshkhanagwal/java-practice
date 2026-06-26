package basics.Linkedlist;

public class LL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printlist() {

        if (head == null) {
            System.err.println("List is empty");
            return;
        }
        Node curr = head;

        while (curr != null) {
            System.err.println(curr.data);
            curr = curr.next;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;

        }

        curr.next = newNode;

    }

    public void addAtIndex(String data, int indx) {
        Node newNode = new Node(data);

        if (indx == 1) {
            newNode.next = head;
            head = newNode;
        }

        Node tmp = head;

        for (int i = 0; i < indx - 1; i++) {
            tmp = tmp.next;
        }

        if (tmp == null) {
            System.err.println("Invalid index");
            return;
        }

        newNode.next = tmp.next;
        tmp = newNode;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("hello");
        list.addFirst("hello2");
        list.addFirst("hello3");
        list.addFirst("hello4");
        list.addFirst("hello5");
        list.addFirst("hello6");

        list.addLast("last elm");

        list.printlist();
    }
}