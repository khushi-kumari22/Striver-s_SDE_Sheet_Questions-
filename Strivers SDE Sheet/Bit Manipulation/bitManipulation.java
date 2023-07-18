//  Q: Get, Set and clear the ith position of num

public class Solution {
    public static int[] bitManipulation(int num, int i){
        // Write your code here.
        int[] ans = new int[3];

        int get = (num & (1<<(i-1))) >> (i-1);
        int set = num | (1<<(i-1));
        int clear = num & ~(1 << (i - 1));

        ans[0]=get;
        ans[1]=set;
        ans[2]=clear;

        return ans;
    }
}