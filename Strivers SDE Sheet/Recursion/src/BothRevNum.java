public class BothRevNum {
    public static void main(String[] args) {
        print1(5);
        print2(5);

        printBoth(5);
    }
    public static void print1(int n){
        if(n==0){
            return;
        }
        print1(n-1);
        System.out.println(n);
    }
    public static void print2(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print2(n-1);
    }

    public static void printBoth(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
