public class sumAndProduct {
    public static void main(String[] args) {
        int ans = sum(12345);
        //  int ans = product(12345);
        System.out.println(ans);
    }

    public static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return sum(n / 10) + (n % 10);
    }
    public static int product(int n){
        if(n <= 1){
            return 1;
        }
        return product(n/10) * (n%10);
    }
}

