class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            int ans = 0;

            while(x > 0){
                ans += x%10;
                x /= 10;
            }
            if(ans == i){
                return i;
            }
        }
        return -1;
    }
}