
import java.util.Scanner;
import java.util.HashSet;

public class TransactionCheck {

    public static boolean hasDuplicate(String[] transactionIds) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < transactionIds.length; i++) {

            if (set.contains(transactionIds[i])) {
                return true;
            }

            set.add(transactionIds[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] transactionIds = new String[n];

        for (int i = 0; i < n; i++) {
            transactionIds[i] = sc.nextLine();
        }

        System.out.println(hasDuplicate(transactionIds));

        sc.close();
    }
}
