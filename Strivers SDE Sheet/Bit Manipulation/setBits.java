//  Q:  Set The Rightmost Unset Bit

public class Solution {
    public static int setBits(int N){
        // Write your code here.
        if((N & N+1)!=0){
            return N|N+1;
        }
        else{
            return N;
        }
    }
}