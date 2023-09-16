// Approach 1:
import java.util.*;

public class SubSet {
    public static void main(String[] args) {
        SubSet("", "abc");

        System.out.println(SubSet2("", "abc"));
    }
    public static void SubSet(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SubSet(p, up.substring(1));
        SubSet(p + ch, up.substring(1));
    }

    // Using Iteration:
     public static ArrayList<String> SubSet2(String p, String up ){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = SubSet2(p, up.substring(1));
        ArrayList<String> right= SubSet2(p+ch, up.substring(1));

        left.addAll(right);

        return left;
    }

}


