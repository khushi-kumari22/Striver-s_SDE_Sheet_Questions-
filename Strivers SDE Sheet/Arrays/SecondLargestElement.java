// Q: Find Second Smallest and Second Largest Element in an array

class Solution {
    int SecondLargestElement(int arr[], int n) {
        int first = arr[0];
        int second = -1;

        for(int i=0; i<n; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]<first && arr[i]>second){
                second = arr[i];
            }
        }
        return second;
    }
}