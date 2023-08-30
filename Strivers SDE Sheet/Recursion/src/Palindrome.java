public class Palindrome {
    public static void main(String[] args) {
      //  reverse(12321);
      //  System.out.println(sum);
        System.out.println(palin(12321));
    }
    static int sum = 0;
    public static int reverse(int n){
        if(n==0){
            return sum;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
         return reverse(n/10);
    }

    public static boolean palin(int n){

        return  n == reverse(n);
    }
}
