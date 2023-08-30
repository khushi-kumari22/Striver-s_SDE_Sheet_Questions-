public class count {
    public static void main(String[] args) {

        System.out.println(count2(10010));
        System.out.println(count(102034));
    }

    //Easy approach:
    public static int count2(int n){
      if(n == 0){
          return 0;
      }
      return 1 + count(n/10);
    }

    // Second approach:
    public static int count(int n){
        return helper(n, 0);
    }
    public static int helper(int n , int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
