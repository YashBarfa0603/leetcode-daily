class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int temp = nums[i];
            while(temp != 0){
                digitSum += temp % 10;
                temp /= 10;
            }
        }
        int ans = Math.abs(sum - digitSum);
        return ans;
    }
}