//  Q:  Maximum Subarray

//  Kadane's Algorithm:

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];

            if(sum > max){
                max = sum;
            }
            // max = Math.max(max,sum);

            if(sum < 0){
                sum = 0;
            }
            // sum = Math.max(sum,0);
        }
        return max;
    }
}


