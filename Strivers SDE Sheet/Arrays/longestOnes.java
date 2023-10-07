public class longestOnes {
    public static int longestOnes(int n, int[] nums, int k) {
        // code here
        int start = 0;
        int end = 0;
        int count = 0;
        int zero = 0;

        while(end<n){
            if(nums[end] == 0){
                zero++;
            }
            while(start<n && zero>k){
                if(nums[start] == 0){
                    zero--;
                }
                start++;
            }
            count = Math.max(count, end-start+1);
            end++;
        }
        return count;
    }
}
