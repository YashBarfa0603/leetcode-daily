class Solution {
    public boolean checkValidString(String s) {
        int low = 0; //mini possible open brackets 
        int high = 0;   // max possible open brackets 
        
        for(char ch: s.toCharArray()){
            if(ch == '('){
                low = low + 1;
                high = high + 1;
            }else if(ch == ')'){
                low = low - 1;
                high = high - 1;
            }else if(ch == '*'){
                low = low - 1;
                high = high + 1; // * can be ) , ( or empty
            }
            if(high < 0){
                return false;
            }
            if(low < 0){
                low = 0;
            }
        }
        if(low == 0){
            return true;
        }
        return false;
    }
}