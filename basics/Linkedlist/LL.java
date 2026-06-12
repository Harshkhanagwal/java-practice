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

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printlist() {
       
        if(head == null){
            System.err.println("List is empty"); 
            return;
        }
        Node curr = head;

        while(curr != null) {
            System.err.println(curr.data);
            curr = curr.next;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null){
            curr = curr.next;

        }

        curr.next = newNode;

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