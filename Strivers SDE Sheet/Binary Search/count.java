//  Q: number of occurance

public class Solution {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int totalCount = 0;
        int start = 0;
        int end = n-1;
        int first = -1;
        int last = -1;

        if(arr[n-1]<x){
            return 0;
        }

        while(start <= end){
            int mid = start + (end - start)/ 2;

            if(arr[mid] == x){
                first = mid;
                end = mid - 1;
            }
            else if(arr[mid] > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        start = 0;
        end = n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == x){
                last = mid;
                start = mid + 1;
            }
            else if(arr[mid] < x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        totalCount = (last - first) + 1;
        return totalCount;
    }
}