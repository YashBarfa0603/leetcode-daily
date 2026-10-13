class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int ans = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target) {
                    ans++;
                }

                int length = j - i + 1;

                if (ans > length / 2) {
                    count++;
                }
            }
        }

        return count;
    }
}
