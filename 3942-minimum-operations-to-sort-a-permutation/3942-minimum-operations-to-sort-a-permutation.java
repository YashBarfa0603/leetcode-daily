class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int increasing = 1, decreasing = 1;

        // check circular increasing and decreasing order
        for (int i = 1; i < n; i++) {

            // check if next element comes in increasing circular order
            if (nums[i] == (nums[i - 1] + 1) % n) {
                increasing++;
            }

            // check if previous element comes in decreasing circular order
            if (nums[i - 1] == (nums[i] + 1) % n) {
                decreasing++;
            }
        }

        // if array follows increasing circular order
        if (increasing == n) {

            // already sorted
            if (nums[0] == 0) {
                return 0;
            }

            // minimum rotations or reverse + rotations
            return Math.min(n - nums[0], nums[0] + 2);
        }

        // if array follows decreasing circular order
        if (decreasing == n) {

            // minimum operations with reversal
            return Math.min(n - nums[n - 1], nums[n - 1]) + 1;
        }

        // array cannot be sorted using given operations
        return -1;
    }
}
