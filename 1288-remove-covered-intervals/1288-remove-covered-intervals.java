class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0; // no. of intervals that remain

        for (int i = 0; i < n; i++) {
            boolean covered = false;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]) {

                    if (intervals[j] != intervals[i] || j < i) {
                        covered = true;
                        break;
                    }
                }
            }
            if (covered) {
                count++;
            }
        }

        return n - count;
    }
}