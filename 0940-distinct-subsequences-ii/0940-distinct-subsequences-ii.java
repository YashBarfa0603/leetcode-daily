class Solution {
    public int distinctSubseqII(String s) {
        // since ask to return modulo
        final long MOD = 1000000007;
        long dp = 1;
        long [] last = new long[26];

        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            long old = dp;
            dp = (2 * dp - last[index]) % MOD;

            if (dp < 0) {
                dp += MOD;
            }

            last[index] = old;
        }

        return (int) ((dp - 1 + MOD) % MOD);
    }
}