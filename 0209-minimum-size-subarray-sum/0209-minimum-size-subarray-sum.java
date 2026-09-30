class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minwindow = Integer.MAX_VALUE;
        int curr_sum = 0;
        int low = 0;
        int high = 0;
        while(high < nums.length){
            curr_sum = curr_sum + nums[high];
            high++;
            while(curr_sum >= target){
                int curr_win = high - low;
                minwindow = Math.min(minwindow, curr_win );
                curr_sum = curr_sum - nums[low];
                low++;
            }
    
        }
        return minwindow == Integer.MAX_VALUE ? 0 : minwindow;
    }
}