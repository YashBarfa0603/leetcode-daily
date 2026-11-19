class Solution {
    public int minimizeSum(int[] nums) {
        if(nums.length <= 3){
            return 0;
        }

        Arrays.sort(nums);

        int n = nums.length;

        int c1 = nums[n - 1] - nums[2];
        int c2 = nums[n - 2] - nums[1];
        int c3 = nums[n - 3] - nums[0];

        int ans = Math.min(Math.min(c1, c2), c3);

        return ans;
    }
}