// Iterative Approach 2:

import java.util.*;
public class SubSet2 {
    public static void main(String[] args) {
         int[] arr = {1, 2, 3};

         List<List<Integer>> ans = SubSet2(arr);
         for(List<Integer> List : ans){
             System.out.println(List);
         }
    }
   static List<List<Integer>> SubSet2(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();

            for(int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
   }
}
