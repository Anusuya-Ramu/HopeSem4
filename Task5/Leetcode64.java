package Task5;

public class Leetcode64 {
    /*64. Minimum Path Sum
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time.  
Example 1:
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1
gives the minimum sum. */
    public static int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(i == 0 && j == 0){
                    dp[i][j] = grid[i][j];
                }
                else {
                    int up = Integer.MAX_VALUE;
                    int left = Integer.MAX_VALUE;

                    if(i > 0) up = dp[i-1][j];
                    if(j > 0) left = dp[i][j-1];

                    dp[i][j] = grid[i][j] + Math.min(up, left);
                }
            }
        }

        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
            int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
            int ans = minPathSum(grid);
            System.out.println(ans);
    }
}
