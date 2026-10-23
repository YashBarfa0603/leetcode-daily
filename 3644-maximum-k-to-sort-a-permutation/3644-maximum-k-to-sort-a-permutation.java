class Solution {
    public int sortPermutation(int[] nums) {
        int ans = 0;
        boolean misplaced = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {

                if (misplaced) {
                    ans = nums[i];
                    misplaced = false;
                } else {
                    ans &= nums[i];
                }
            }
        }
        return ans;
    }
}