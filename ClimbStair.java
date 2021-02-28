public class ClimbStair {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len];
        if(len == 1)
            return cost[0];
        if(len == 2)
            return cost[1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i-1] + cost[i], dp[i-2] + cost[i]);
        }
        return Math.min(dp[len-1], dp[len-2]);
    }
}