class Solution {
    public int minMoves(int[] nums) {
        int mn = Integer.MAX_VALUE;

        for(int num: nums){
            if(num < mn){
                mn = num;
            }
        }
        int move = 0;
        for(int i = 0; i < nums.length; i++){
            move += nums[i];
        }
        return move - (nums.length * mn);
    }
}