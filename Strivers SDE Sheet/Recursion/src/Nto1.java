public class Nto1 {
    public static void main(String[] args) {
        print1(5);
    }
    public static void print1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print1(n-1);
     //  print1(--n);
    }

}
