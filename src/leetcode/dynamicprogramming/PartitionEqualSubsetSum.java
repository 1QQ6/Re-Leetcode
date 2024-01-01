package leetcode.dynamicprogramming;

/**
 * 416. 分割等和子集
 */
public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,5,11,5};
        boolean b = canPartition(arr);
        System.out.println(b);
    }
    public static boolean canPartition(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        int n = nums.length;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        //总和为奇数，不能平分
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for(int i = 0; i < n; i++) {
            System.out.println("=========");
            for(int j = target; j >= nums[i]; j--) {
                //物品 i 的重量是 nums[i]，其价值也是 nums[i]
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                System.out.println("dp["+j+"] - nums["+i+"]]="+dp[j - nums[i]]+"nums[i]"+ nums[i]+"dp[j - nums[i]] + nums[i]="+(dp[j - nums[i]] + nums[i]));
                System.out.println("背包总容量是:"+j+"，放进物品后，背的最大重量为 ="+dp[j]);
            }
            //剪枝一下，每一次完成內層的for-loop，立即檢查是否dp[target] == target，優化時間複雜度（26ms -> 20ms）
            if(dp[target] == target)
                return true;
        }
        return dp[target] == target;
    }
}
