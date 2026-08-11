class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int i = 1;

        // Find sequential prefix sum
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        // Find smallest missing integer
        while (true) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == sum) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return sum;
            }

            sum++;
        }
    }
}