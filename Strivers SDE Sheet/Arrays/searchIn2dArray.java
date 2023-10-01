import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr ={
                {21 ,12 ,33 ,32},
                {23 ,43 ,2},
                {54 ,12},
                {12 ,32 ,321 ,56},
        };
        int target = 54;
        int ans[] = search(arr , target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1 ,-1};
    }
}
