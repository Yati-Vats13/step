
import java.util.Scanner;

public class SpiralTraversal {

    public static void spiralOrder(int[][] grid) {

        int top = 0;
        int bottom = grid.length - 1;
        int left = 0;
        int right = grid[0].length - 1;

        while (top <= bottom && left <= right) {

            // Traverse left to right
            for (int i = left; i <= right; i++) {
                System.out.print(grid[top][i] + " ");
            }
            top++;

            // Traverse top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(grid[i][right] + " ");
            }
            right--;

            // Traverse right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(grid[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(grid[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.print("[");
        spiralOrder(grid);
        System.out.println("]");

        sc.close();
    }
}
