// Q:  LowerBound


public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int start = 0;
        int end = arr.length;

        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid]<x){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}