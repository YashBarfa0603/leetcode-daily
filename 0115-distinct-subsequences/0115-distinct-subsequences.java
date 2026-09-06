class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][m] = 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if(s.charAt(i) == t.charAt(j)){
                // Two choices:
                // 1. Use s[i] -> move both i and j
                // 2. Skip s[i] -> move only i
                dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                }
                else{
                    // Characters are different,
                // so we cannot use s[i].
                // Skip it.
                dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }
}