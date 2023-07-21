//  Q:  Check if a number is odd or not

public class Solution {
    public static String oddEven(int N){
        // Write your code here.
        if((N & 1) == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }
}