// Selection Sort

public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int minInx = min(arr,i,n);

            int temp = arr[minInx];
            arr[minInx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int min(int arr[], int i,int n)
    {
        int min = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min])
                min = j;
        }
        return min;
    }
}