import java.util.ArrayList;
import java.util.Collections;

public class Soal12 {
    public static void main(String[] args) {
        int[][] grid = {
            {2, 4, 1, 3},
            {3, 2, 5, 1},
            {4, 3, 2, 6},
            {1, 2, 4, 5}
        };

        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        String[][] path = new String[n][m];

        dp[0][0] = grid[0][0];
        path[0][0] = "(0,0)";

        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
            path[0][j] = path[0][j - 1] + " -> (" + 0 + "," + j + ")";
        }

        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
            path[i][0] = path[i - 1][0] + " -> (" + i + "," + 0 + ")";
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                    path[i][j] = path[i - 1][j] + " -> (" + i + "," + j + ")";
                } else {
                    dp[i][j] = grid[i][j] + dp[i][j - 1];
                    path[i][j] = path[i][j - 1] + " -> (" + i + "," + j + ")";
                }
            }
        }

        System.out.println("Matriks nilai maksimum:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTotal energi maksimum: " + dp[n - 1][m - 1]);
        System.out.println("Jalur terbaik: " + path[n - 1][m - 1]);
    }
}
