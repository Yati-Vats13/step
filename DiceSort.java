
import java.util.Scanner;

public class DiceSort  {

    public static int[] diceSort(int[] rolls) {
        int[] count = new int[7];

        // Count each dice number
        for (int i = 0; i < rolls.length; i++) {
            count[rolls[i]]++;
        }

        // Print counts
        System.out.print("Counts: ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ":" + count[i] + " ");
        }
        System.out.println();

        // Create sorted array
        int[] result = new int[rolls.length];
        int index = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < count[i]; j++) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] rolls = new int[n];

        for (int i = 0; i < n; i++) {
            rolls[i] = sc.nextInt();
        }

        int[] sorted = diceSort(rolls);

        System.out.print("Sorted: [");

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);

            if (i < sorted.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        sc.close();
    }
}
