
import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class CancelBooking {

    static Node removeFirst(Node head, String booking) {

        if (head == null) {
            System.out.println(booking + " not found");
            return head;
        }

        if (head.data.equals(booking)) {
            return head.next;
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data.equals(booking)) {
                temp.next = temp.next.next;
                return head;
            }

            temp = temp.next;
        }

        System.out.println(booking + " not found");
        return head;
    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            String booking = sc.next();
            Node newNode = new Node(booking);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        String cancel = sc.next();

        boolean found = false;
        Node temp = head;

        while (temp != null) {
            if (temp.data.equals(cancel)) {
                found = true;
                break;
            }
            temp = temp.next;
        }

        if (found) {
            head = removeFirst(head, cancel);
            printList(head);
        } else {
            System.out.println(cancel + " not found");
            printList(head);
        }

        sc.close();
    }
}
