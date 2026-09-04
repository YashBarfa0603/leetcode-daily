class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int [] left = new int[n];
        left [n-1]= nums[n-1];

        for(int i = n-2; i>=0; i--){
            left[i] = Math.min(nums[i],left[i+1]);
        }
        int right = 0;
        for(int i = 0; i < n; i++){
            right = Math.max(nums[i],right);
            if(right - left[i] <= k){
                return i;
            }
        }
        return -1;
    }
}