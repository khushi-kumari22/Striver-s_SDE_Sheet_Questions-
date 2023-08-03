//  Q:  square root of a number

import java.util.* ;
import java.io.*;

public class Solution {

    public static int sqrtN(long N) {
        /*
         * Write your code here
         */
        int start = 0;
        int end = (int)N;
        int ans = -1;

        if (N == 0 || N == 1) {
            return (int)N;
        }

        while(start <= end){
            int mid = (start + end) / 2;

            if(mid * mid <= N){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
