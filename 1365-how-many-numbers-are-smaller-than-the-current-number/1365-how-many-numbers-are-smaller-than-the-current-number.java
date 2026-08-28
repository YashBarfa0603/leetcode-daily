class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];
        int index = 0;
        for(int i :nums){
            int count = 0;
            for(int j: nums){
                if(j< i){
                    count++;
                }
            }
            ans[index] = count;
            index++;
        }
        return ans;
    }
}