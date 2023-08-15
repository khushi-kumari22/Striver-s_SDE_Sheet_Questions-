// Write a code to flip the bits:

class Solution {

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int zeros=0;
        int ones=0;
        int maxZero=-1;
        for(int idx=0; idx<n; idx++){
            if(a[idx]==0){
                zeros++;
                maxZero = Math.max(maxZero, zeros);
            } else {
                ones++;
                if(zeros>0){
                    zeros--;
                }
                maxZero = Math.max(maxZero, zeros);
                if(zeros<0){
                    zeros=0;
                }
            }
        }

        return maxZero+ones;
    }
}
