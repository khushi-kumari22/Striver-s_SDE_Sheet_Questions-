//  Q: single Non Duplicate integer

import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        int ans = 0;
        int n = arr.size();

        for (int i=0; i<n; i++) {
            ans = ans ^ arr.get(i);
        }
        return ans;
    }
}