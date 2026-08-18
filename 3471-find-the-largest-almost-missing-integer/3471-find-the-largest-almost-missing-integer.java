class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        if (k == 1) {
            int ans = -1;

            for (int i = 0; i < n; i++) {
                int count = 0;

                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                if (count == 1) {
                    ans = Math.max(ans, nums[i]);
                }
            }

            return ans;
        }
        if (k == n) {
            int ans = nums[0];

            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, nums[i]);
            }

            return ans;
        }

        // Case 3: 1 < k < n
        int first = nums[0];
        int last = nums[n - 1];

        int firstCount = 0;
        int lastCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == first) {
                firstCount++;
            }

            if (nums[i] == last) {
                lastCount++;
            }
        }

        int ans = -1;

        if (firstCount == 1) {
            ans = Math.max(ans, first);
        }

        if (lastCount == 1) {
            ans = Math.max(ans, last);
        }

        return ans;
    }
}