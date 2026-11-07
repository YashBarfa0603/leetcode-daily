class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] square = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            long sq = (long) nums[i] * nums[i];
            square[i] = sq;
        }

        Arrays.sort(square);

        long ans = 0;
        for(int i = 0; i < square.length; i++){
            int mid = square.length / 2;

            if(i < mid){
                ans -= square[i];
            }
            else{
                ans += square[i];
            }
        }
        return ans;
    }
}