// Insertion sort
import java.util.Arrays;

public class insertionSort{
    public static void main(String[] args){
        int[arr] = {3,4,1,2,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int insertionSort(int[] arr, int n) {

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}