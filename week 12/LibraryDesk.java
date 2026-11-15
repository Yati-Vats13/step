
import java.util.Scanner;

public class LibraryDesk {

    static String[] pile = new String[3];
    static int top = -1;

    static String[] line = new String[3];
    static int front = 0;
    static int rear = -1;
    static int size = 0;

    static void RETURN(String book) {
        if (top == 2) {
            System.out.println(book + " rejected: pile is full");
        } else {
            top++;
            pile[top] = book;
            System.out.println(book + " placed on pile");
        }
    }

    static void SHELVE() {
        if (top == -1) {
            System.out.println("pile is empty");
        } else {
            System.out.println("shelved " + pile[top]);
            top--;
        }
    }

    static void WAIT(String student) {
        if (size == 3) {
            System.out.println(student + " rejected: line is full");
        } else {
            rear = (rear + 1) % 3;
            line[rear] = student;
            size++;

            System.out.println(student + " joined the line");
        }
    }

    static void SERVE() {
        if (size == 0) {
            System.out.println("no one waiting");
        } else {
            System.out.println("served " + line[front]);
            front = (front + 1) % 3;
            size--;

            if (size == 0) {
                rear = front - 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            if (command.equals("RETURN")) {
                String book = sc.next();
                RETURN(book);
            } else if (command.equals("SHELVE")) {
                SHELVE();
            } else if (command.equals("WAIT")) {
                String student = sc.next();
                WAIT(student);
            } else if (command.equals("SERVE")) {
                SERVE();
            }
        }

        sc.close();
    }
}
