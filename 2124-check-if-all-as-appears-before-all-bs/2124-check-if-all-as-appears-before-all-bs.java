class Solution {
    public boolean checkString(String s) {
        boolean isB = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'b'){
                isB = true;
            }
            if(s.charAt(i) == 'a' && isB == true){
                return false;
            }    
        }
        return true;
    }
}