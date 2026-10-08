class Solution {
    public String removeOuterParentheses(String s) {
        int left = 0;
        int right = 0;
        int depth = 0;
        String ans = "";

        while(right < s.length()){
            if(s.charAt(right) == '('){
                depth += 1;
            }else{
                depth -= 1;
            }
            if(depth == 0){
                ans += s.substring(left + 1, right);
                left = right + 1;
            }
            right += 1;
        }
        return ans;
    }
}