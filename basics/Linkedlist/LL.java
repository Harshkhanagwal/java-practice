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
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println();
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

        // Insert at beginning
        if (indx == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node tmp = head;

        // Move to the node before the desired index
        for (int i = 1; i < indx - 1 && tmp != null; i++) {
            tmp = tmp.next;
        }

        // Invalid index
        if (tmp == null) {
            System.out.println("Invalid Index");
            return;
        }

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node crnt = head;

        while (crnt != null) {
            if (crnt.next != null && crnt.next.next == null) {
                crnt.next = null;
                break;
            }
            crnt = crnt.next;

        }
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node tmp = head;

        for (int i = 1; i < index - 1 && tmp != null; i++) {
            tmp = tmp.next;
        }

        tmp.next = tmp.next.next;

    }

    public int length() {

        Node tmp = head;
        int l = 0;
        while (tmp != null) {
            l++;
            tmp = tmp.next;
        }
        return l;
    }

    public boolean search(String data) {

        Node tmp = head;

        while (tmp != null) {
            if (tmp.data.equals(data)) {
                return true;
            }
            tmp = tmp.next;
        }

        return false;
    }

    public void reverseList() {

        if (head == null || head.next == null) {
            System.out.println("list is empty");
            return;
        }

        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.addLast("7");
        list.addLast("8");

        list.printlist();

        list.reverseList();

        list.printlist();

    }
}
