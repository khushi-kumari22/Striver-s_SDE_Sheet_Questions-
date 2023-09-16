import java.util.*;

public class SubSetDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};

        List<List<Integer>> ans = SubSetDuplicate(arr);
        for(List<Integer> List : ans){
            System.out.println(List);
        }
    }
    static List<List<Integer>> SubSetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++) {
                start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
          return outer;
    }
}