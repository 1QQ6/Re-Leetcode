package leetcode.dynamicprogramming;

/**
 * 62. 不同路径
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0){
            return 0;
        }
        int[][] dp = new int[m][n];
        //初始化：第一行和第一列都为1
        for(int i = 0; i < m ; i ++){
            dp[i][0] = 1;
        }
        for(int i = 0; i < n; i ++){
            dp[0][i] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j ++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
