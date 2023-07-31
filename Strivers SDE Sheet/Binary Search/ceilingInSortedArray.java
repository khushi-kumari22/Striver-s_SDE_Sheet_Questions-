//  Q: Ceil the floor

public class Solution {
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        // Write your code here.
        int floor = -1;
        int ceil = -1;

        for(int i=0; i<n; i++){
            if(arr[i]<=x){
                floor = Math.max(floor, arr[i]);
                ans.add(floor);
            }
            if(arr[i]>=x){
                if(ceil == -1){
                    ceil = arr[i];
                }
                else{
                    ceil = Math.min(ceil, arr[i]);
                    ans.add(ceil);
                }
            }
        }

        return ans;
    }
}
