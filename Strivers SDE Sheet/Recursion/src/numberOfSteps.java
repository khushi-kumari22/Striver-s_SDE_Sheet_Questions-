public class numberOfSteps {
    public static void main(String[] args) {
        int ans = steps(123);
      System.out.println(ans);
    }
    public static int steps(int n){
        int ans = 0;
        int count = 0;

        while(n!=0){
            if(n%2 == 0){
                ans = n/2;
                count++;
            }
            else{
                ans = n-1;
            }
        }
        return count;
    }
}
