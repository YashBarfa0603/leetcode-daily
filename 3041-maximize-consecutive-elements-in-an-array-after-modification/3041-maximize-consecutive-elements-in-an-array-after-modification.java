class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int max = nums[n-1];
        int[] dp = new int[max + 2];
        int ans = 1;

        for(int num: nums){
            dp[num + 1] = dp[num] + 1;

            dp[num] = dp[num - 1] + 1;

            ans = Math.max(ans, Math.max(dp[num], dp[num + 1]));
        }
        return ans;
    }
}