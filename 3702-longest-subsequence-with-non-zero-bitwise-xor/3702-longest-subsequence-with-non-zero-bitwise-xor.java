class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        boolean nonZero = false;
        for(int i: nums){
            ans ^= i;

            if(i != 0){
                nonZero = true;
            }
        }
        if(ans != 0){
            return nums.length;
        }
        if(nonZero){
            return nums.length - 1;
        }
        return 0;
    }
}