class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            int count = i + 1;
            if(n % count == 0){
                ans += nums[i] * nums[i];
            }
        }
        return ans;
    }
}