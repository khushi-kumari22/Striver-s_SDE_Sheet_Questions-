public class RightShift {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int ans = RightShift(arr);
        System.out.println(ans);

    }
    public static int RightShift(int[] nums) {
        int n = nums.length-1;
        int count = 0;
        int[] arr = nums;
        for(int i=0; i<n; i++){

            if(nums[i + 1] != nums[i]){
                int temp = nums[0];
                nums[0] = nums[n-1];
                nums[n-1] = nums[0];
                count++;
            }
        }
        return count;
    }
}
