import java.util.*;

public class CountPermutation {
    public static void main(String[] args) {
        System.out.println(CountPermutation("", "abc"));
    }
    static int CountPermutation(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + (CountPermutation(f+ch+s, up.substring(1)));
        }
        return count;
    }
}
