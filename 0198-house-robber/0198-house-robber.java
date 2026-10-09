class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int current = 0;
        for(int num: nums){
            int temp = current;

            if(prev + num > current){
                current = prev + num;
            }
            prev = temp;
        }
        return current;
    }
}