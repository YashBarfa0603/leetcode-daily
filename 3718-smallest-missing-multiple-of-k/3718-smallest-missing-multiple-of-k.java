class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i = 1;
        while(true){
            int m = i * k;
            boolean ans = false;
            for (int j = 0; j<= nums.length - 1; j++){
                if(nums[j] == m){
                    ans = true;
                }
            }
            if(ans == true){
                i++;
            }else{
                return m;
            }

        }
    }
}