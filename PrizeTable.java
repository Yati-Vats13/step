
import java.util.Scanner;

public class PrizeTable {

    public static int prizeTable(int[] marks) {

        int swaps = 0;

        // Selection sort in descending order
        for (int i = 0; i < marks.length - 1; i++) {

            int maxIndex = i;

            // Find the maximum element
            for (int j = i + 1; j < marks.length; j++) {

                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap if maximum is not in the correct position
            if (maxIndex != i) {

                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;

                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int swaps = prizeTable(marks);

        System.out.print("Sorted marks in descending order: ");

        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println("\nNumber of swaps = " + swaps);

        sc.close();
    }
}
