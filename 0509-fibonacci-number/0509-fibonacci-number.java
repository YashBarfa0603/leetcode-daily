class Solution {
    public int fib(int n) {
        if(n < 2){
            return n;
        }
        int pre = 0;
        int current = 1;
        for(int i = 2; i <= n; i++){
            int next = pre + current;
            pre = current;
            current = next;
        }
        return current;
    }
}