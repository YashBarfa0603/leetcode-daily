class Solution {
    public boolean uniformArray(int[] nums1) {
        int ans = nums1[0];
        boolean odd = false;
        // smallest odd
        for (int i = 0; i < nums1.length; i++){
            if(nums1[i] % 2 != 0){
                if(!odd || nums1[i] < ans){
                    ans = nums1[i];
                    odd = true;
                }
            }
        }
        // all even
        if(!odd){
            return true;
        }
        for(int j = 0; j < nums1.length; j++){
            if(nums1[j] % 2 == 0 && nums1[j] <= ans ){
                return false;
            }
        }
        return true;
    }
}