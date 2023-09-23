class Solution {
    public double myPow(double x, int n) {

        // Using Formula:
        double ans = 0;
        ans = (double)Math.pow(x,n);
        return ans;

        // Using Recursion:
        if(n==0){
            return 1;
        }
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x * myPow(x*x, n/2);

        // Using Bit:
        if(n < 0){
            n = -n;
            x = 1 / x;
        }

        double pow = 1;
        while(n != 0){
            if((n & 1) != 0){
                // equivalent to if((n % 2) != 0) i.e. multiply only when the number is odd
                pow = pow * x;
            }
            x = x * x;
            n = n >>> 1;
            // equivalent to n = n / 2; i.e. keep dividing the number by 2
        }

        return pow;
    }
}