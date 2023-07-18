//  Q: Check if the i-th bit is set or not

public class Solution {
    static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        if((n & 1<<(k-1)) == 0){
            return false;
        }
        else{
            return true;
        }
    }
}