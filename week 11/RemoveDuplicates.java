
import java.util.Scanner;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int length = removeDuplicates(nums);

        System.out.println("length = " + length);

        System.out.print("nums[0.." + (length - 1) + "] = [");

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i]);

            if (i < length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}
