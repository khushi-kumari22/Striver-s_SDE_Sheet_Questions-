//  Q: UpperBound


public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int start = 0;
        int end = arr.length;

        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid]<=x){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}