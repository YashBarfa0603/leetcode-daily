class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            int sum = 0;

            while(x > 0){
                int digit = x % 10;
                sum += digit;
                x = x / 10;
            }
            ans = Math.min(ans,sum);
        }
        return ans;
    }
}