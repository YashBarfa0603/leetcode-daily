class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k == 0) {

                boolean sortable = true;
                int previousMax = Integer.MIN_VALUE;

                for (int i = 0; i < n; i += k) {
                    int count = 0;

                    int minValue = nums[i];
                    int maxValue = nums[i];

                    for (int j = i; j < i + k; j++) {
                        int next = (j + 1 == i + k) ? i : j + 1;

                        if (nums[j] > nums[next]) {
                            count++;
                        }

                        // Store the smallest element in the current block
                        minValue = Math.min(minValue, nums[j]);

                        // Store the largest element in the current block
                        maxValue = Math.max(maxValue, nums[j]);
                    }
                    // Block sorted hai aur previous block se order sahi hai
                    if (count > 1 || previousMax > minValue) {
                        sortable = false;
                        break;
                    }
                    previousMax = maxValue;
                }
                if (sortable) {
                    ans += k;
                }
            }
        }

        return ans;
    }
}