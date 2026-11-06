class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int zero = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                zero++;
            }
            else if(s.charAt(i) == '1' && zero > 0){
                ans = Math.max(ans + 1, zero);
            }
        }
        return ans;
    }
}