// Q: Find Matrix median of two sorted arrray

public class Solution {
    public int findMedian2(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int N = R * C;
        int median = N/2;
        int start = 1;
        int end = 1000000000;

        while(start<=end){
            int mid = start + (end - start)/2;
            int min = minElement(matrix,mid);

            if(min<=median){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }

    public static int minElement(int matrix[][], int mid){
        int ans = 0;

        for(int i=0; i<matrix.length; i++){
            int start = 0;
            int end = matrix[i].length-1;

            while(start<=end){
                int middle = start + (end - start)/2;

                if(matrix[i][middle] <= mid){
                    start = middle + 1;
                }
                else{
                    end = middle - 1;
                }
            }
            ans = ans + start;
        }
        return ans;
    }
}