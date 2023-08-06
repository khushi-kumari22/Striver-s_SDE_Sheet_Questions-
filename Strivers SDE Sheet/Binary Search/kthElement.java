//  Q:  Find the Kth element of two sorted array

import java.util.ArrayList;
public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here
        ArrayList<Integer> arr3 = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<n && j<m){
            if(arr1.get(i) < arr2.get(j)){
                arr3.get(i);
                i++;
            }
            else{
                arr3.get(j);
                j++;
            }
        }

        while(i<n){
            arr3.get(i);
            i++;
        }

        while(j<m){
            arr3.get(j);
            j++;
        }

        return arr3.get(k-1);
    }
}

