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

        newNode.next = tmp.next;
        tmp.next = newNode;
    }


    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
        }else{
            head = head.next;
        }
    }


    public void deleteLast() {
        if(head == null ) {
            System.out.println("List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node crnt = head;

        while(crnt != null) {
            if(crnt != null && crnt.next== null) {
                crnt = null;
            }
            crnt = crnt.next;
        }
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

        list.printlist();

        list.deleteFirst();

        list.printlist();
    }
}