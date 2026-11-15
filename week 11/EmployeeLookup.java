
import java.util.Scanner;
import java.util.HashMap;

public class EmployeeLookup {

    public static HashMap<String, String> buildLookup(String[][] records) {

        HashMap<String, String> lookup = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            lookup.put(records[i][0], records[i][1]);
        }

        return lookup;
    }

    public static String getDepartment(HashMap<String, String> lookup, String employeeId) {

        if (lookup.containsKey(employeeId)) {
            return lookup.get(employeeId);
        }

        return "Unknown";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[][] records = new String[n][2];

        for (int i = 0; i < n; i++) {
            records[i][0] = sc.nextLine();
            records[i][1] = sc.nextLine();
        }

        HashMap<String, String> lookup = buildLookup(records);

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String employeeId = sc.nextLine();

            System.out.println(getDepartment(lookup, employeeId));
        }

        sc.close();
    }
}
