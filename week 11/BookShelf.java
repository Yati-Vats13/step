
import java.util.Scanner;

public class BookShelf {

    public static void shelf(int[] books) {

        for (int i = 1; i < books.length; i++) {

            int key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j] > key) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;

            // Print shelf after placing each book
            System.out.print("After placing " + key + ": [");

            for (int k = 0; k < books.length; k++) {
                System.out.print(books[k]);

                if (k < books.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("]");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        shelf(books);

        sc.close();
    }
}
