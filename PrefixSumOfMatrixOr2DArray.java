//www.geeksforgeeks.org/problems/2d-submatrix-sum-queries/1

import java.util.ArrayList;

public class PrefixSumOfMatrixOr2DArray {

    public ArrayList<Integer> prefixSum2D(int[][] arr, int[][] queries) {

        int n = arr.length;
        int m = arr[0].length;

        // Construct prefix sum matrix
        int[][] prefix = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {

                // Start with original value
                prefix[i][j] = arr[i][j];

                // Add value from top cell if it exists
                if (i > 0)
                    prefix[i][j] += prefix[i - 1][j];

                // Add value from left cell if it exists
                if (j > 0)
                    prefix[i][j] += prefix[i][j - 1];

                // Subtract overlap from top-left diagonal if it exists
                if (i > 0 && j > 0)
                    prefix[i][j] -= prefix[i - 1][j - 1];
            }
        }

        // Result list
        ArrayList<Integer> result = new ArrayList<>();

        // Process each query using inclusion-exclusion
        for (int i = 0; i < queries.length; i++) {
            int r1 = queries[i][0];
            int c1 = queries[i][1];
            int r2 = queries[i][2];
            int c2 = queries[i][3];

            int total = prefix[r2][c2];

            if (r1 > 0)
                total -= prefix[r1 - 1][c2];

            if (c1 > 0)
                total -= prefix[r2][c1 - 1];

            if (r1 > 0 && c1 > 0)
                total += prefix[r1 - 1][c1 - 1];

            result.add(total);
        }

        return result;
    }

}
