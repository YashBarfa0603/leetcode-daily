class Solution {
    public int totalWaviness(int num1, int num2) {
        int total = 0;

        for(int i = num1; i <= num2; i++){
            int n = i;

            while(n >= 100){
                int right = n % 10;
                int mid = (n / 10) % 10;
                int left = (n / 100) % 10;

                if((mid > left && mid > right) || (mid < left && mid < right)){
                    total += 1;
                }
                n = n /10;
            }
        }
        return total;
    }
}