// [2,7,1,19,18,3]
class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int mul = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
             if (n % (i + 1) == 0){
             mul = nums[i] * nums[i];
             sum = sum + mul;
            }
            

        }
        return sum;
    }
}