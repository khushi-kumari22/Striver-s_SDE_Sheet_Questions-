//  Q:  Divide Two Integers


public class Solution{
    public static int divideTwoInteger(int dividend, int divisor) {
        // Write your code here.

         int quotient = 0;

         boolean isDividendNegative = false;
         if(dividend < 0){
             dividend = dividend*(-1);
             isDividendNegative = true;
         }

         boolean isDivisorNegative = false;
         if(divisor < 0){
              divisor = divisor*(-1);
              isDivisorNegative = true;
         }

         while(dividend >= divisor){
             dividend = dividend - divisor;
             quotient = quotient + 1;
             }

        // Both are negative.
        if(isDividendNegative && isDivisorNegative)
        {
            return quotient;
        }

        // Both are positive.
        if(!isDividendNegative && !isDivisorNegative)
        {
            return quotient;
        }

         return (-1)*quotient;
     }
 }
 