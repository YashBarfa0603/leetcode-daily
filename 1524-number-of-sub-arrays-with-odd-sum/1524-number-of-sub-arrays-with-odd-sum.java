class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1000000007;
        int even = 1;
        int odd = 0;
        int ans = 0;
        int sum = 0;

        for(int nums: arr){
            sum = (sum + nums) % 2;

            if(sum == 1){
                ans = (ans + even) % MOD;
                odd += 1;
            }
            else{
                ans = (ans + odd) % MOD;
                even += 1;
            }
        }
        return (int) ans;
    }
}