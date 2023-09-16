import java.util.*;

public class SubSetAscii {
    public static void main(String[] args) {
        SubSetAscii("", "abc");

        System.out.println(SubSetAscii2("", "abc"));
    }
    public static void SubSetAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        SubSetAscii(p, up.substring(1));
        SubSetAscii(p+ch, up.substring(1));
        SubSetAscii(p+(ch+0), up.substring(1));
    }

    // Approach 2:
    public static ArrayList<String> SubSetAscii2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = SubSetAscii2(p , up.substring(1));
        ArrayList<String> second = SubSetAscii2(p+ch, up.substring(1));
        ArrayList<String> third = SubSetAscii2(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
