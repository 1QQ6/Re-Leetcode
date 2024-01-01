package leetcode.dynamicprogramming;

/**
 * 1049. Last Stone Weight II
 * 最后一块石头的重量 II
 */
public class LastStoneWeightII {
    public int lastStoneWeightII(int[] stones) {
        if(stones == null || stones.length == 0){
            return 0;
        }
        int sum = 0;
        for(int item : stones){
            sum+= item;
        }
        int target = sum >> 1;
        int[] dp = new int[target+1];
        //遍历石头
        for(int i = 0;i < stones.length;i++){
            for(int j = target;j >= stones[i];j--){
                dp[j] = Math.max(dp[j],dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - dp[target] * 2;
    }
}
