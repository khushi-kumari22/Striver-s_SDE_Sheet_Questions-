// Q:  Row with max 1s


import java.util.ArrayList;
public class Solution
{
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int maxCount = 0;
        int ans = 0;

        for(int row=0; row<n; row++){
            int count = 0;

            for(int col=0; col<m; col++){
                if(matrix.get(row).get(col)==1){
                    count++;
                }
            }
            if(count > maxCount){
                ans = row;
                maxCount = count;
            }
        }
        return ans;
    }
}