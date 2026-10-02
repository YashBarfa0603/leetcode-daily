class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] arr = text.toCharArray();
        int ans = 0;

        while(true){
            String word = "balloon";

            for(char ch: word.toCharArray()){
                boolean found = false;

                for(int i = 0; i < arr.length; i++){
                    if(arr[i] == ch){
                        arr[i] = '#';
                        found = true;
                        break;
                    }
                }
                if(!found){
                    return ans;
                }
            }
            ans++;
        }
    }
}