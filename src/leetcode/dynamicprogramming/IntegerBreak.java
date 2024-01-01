package leetcode.dynamicprogramming;

/**
 * 343. 整数拆分
 */
public class IntegerBreak {
        public int integerBreak(int n) {
            if(n == 0){
                return 0;
            }
            int[] dp = new int[n+1];
            dp[0] = 0;
            dp[1] = 0;
            dp[2] = 1;
            for(int i = 3;i <= n;i++){
                for(int j = 1;j <= i/2 ; j++){
                    dp[i] = Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
                }
            }
            return dp[n];
        }
}
