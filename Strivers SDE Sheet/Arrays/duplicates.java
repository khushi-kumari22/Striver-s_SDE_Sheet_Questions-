import java.util.*;

public class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int res[] = new int[n];

        for(int i=0; i<n; i++){
            res[arr[i]]++;
        }

        for(int i=0; i<n; i++){
            if(res[i] > 1){
                ans.add(i);
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
    }
}
