//  Nth Fibonacci Number

class Solution {
    static int nthFibonacci(int n){
        // code here
        if(n==0 || n==1){
            return n;
        }
        long a = 0;
        long b = 1;
        long sum = 0;
        for(int i=2; i<=n; i++){
            sum = (a+b) % 1000000007 ;
            a = b;
            b = sum;
        }
        return (int)sum;
    }
}