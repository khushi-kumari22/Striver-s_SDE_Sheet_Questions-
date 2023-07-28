//  Q:  XOR of the element in the range [L,R]

public class Solution {
    public static int findXOR(int L, int R){
        // Write your code here.
        int ans = 0;
        ans = xor1toN(R) ^ xor1toN(L-1);
        return ans;
    }
    public static int xor1toN(int N){
        if(N % 4==0){
            return N;
        }
        else if(N % 4==1){
            return 1;
        }
        else  if(N % 4==2){
            return N+1;
        }
        else if(N % 4==3){
            return 0;
        }
        return -1;
    }

}
