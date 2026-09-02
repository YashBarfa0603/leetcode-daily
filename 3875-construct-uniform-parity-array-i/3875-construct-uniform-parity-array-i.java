class Solution {
    public boolean uniformArray(int[] nums1) {
       // return true;
       int even = 0;
       int odd = 0;
       for(int i = 0; i < nums1.length; i++){
            if(nums1[i] % 2 == 0){
                even += 1;
            }
            else{
                odd += 1;
            }
        }
        if(even == 0 || odd == 0 || even >= 1 || odd >= 1){
            return true;
        }
        return false;
    }
}