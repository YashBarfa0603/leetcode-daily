class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int  sum = 0;
        int product = 1;

        while(n>0){
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n/10;
        } 
        int divisor = sum + product;
        if (x % divisor == 0){
            return true;
        }
        else{
            return false;
        }
    }
}