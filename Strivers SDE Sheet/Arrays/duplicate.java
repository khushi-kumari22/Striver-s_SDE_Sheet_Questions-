import java.util.ArrayList;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 20, 30, 40};
        ArrayList<Integer> result = duplicateElement(arr);
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }
    public static ArrayList<Integer> duplicateElement(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
         ans.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
