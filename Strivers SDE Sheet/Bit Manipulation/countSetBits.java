//  Q:  countSetBits

public class Solution{
    public static int countSetBits(int n) {
        //Write your code here
        if (n == 0) {
            return 0;
        }

        int res = 0;
        while((1 << res) <= n) {
            res++;
        }

        if (1 << res == n) {
            int a = res * (1 << (res - 1)) + 1;
            return a;

        }else {
            int x = res - 1;
            int a = x * (1 << (x - 1));
            int b = n + 1 - (1 << x);

            return a + b + countSetBits(b - 1);

        }
    }
}