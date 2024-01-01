package leetcode.dynamicprogramming;

/**
 * 509. 斐波那契数
 *
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        int fib = fib(5);
    }
        public static int fib(int n) {
            if(n < 2){
                return n;
            }
            int[] dp = new int[n+1];
            dp[0] = 0;
            dp[1] = 1;
            for(int i = 2; i <= n;i++){
                dp[i] = dp[i -1] + dp[i-2];
            }

            return dp[n];
        }
}
