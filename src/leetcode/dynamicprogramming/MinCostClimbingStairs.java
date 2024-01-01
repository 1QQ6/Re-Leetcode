package leetcode.dynamicprogramming;

/**
 * 746. 使用最小花费爬楼梯
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        int i = minCostClimbingStairs(cost);
        System.out.println(i);
    }
    public static int minCostClimbingStairs(int[] cost) {
//        if(cost == null || cost.length == 0){
//            return 0;
//        }
//        if(cost.length == 1){
//            return cost[0];
//        }
//        if(cost.length <= 2){
//            return Math.min(cost[0],cost[1]);
//        }
//
//        //dp[i]定义为到达台阶需要花费的最少花费金额
//        int[] dp = new int[cost.length+1];
//        dp[0] = 0;
//        dp[1] = 0;
//        for(int i = 2;i <= cost.length;i++){
//            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
//        }
//        return dp[cost.length];

        if(cost == null || cost.length == 0){
            return 0;
        }
        //dp[i]定义为到达台阶需要花费的最少花费金额
        int[] dp = new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2;i < cost.length;i++){
            dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
