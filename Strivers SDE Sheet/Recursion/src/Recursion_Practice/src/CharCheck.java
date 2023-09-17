public class CharCheck {
    public static void main(String[] args) {
        System.out.println(check("bccacd"));
        check2("", "bccacd");
    }

    public static String check(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);

        if (ch == 'a') {
            return check(s.substring(1));
        } else {
            return ch + check(s.substring(1));
        }
    }

    // Approach 2:
    public static void check2(String str, String s) {
        if (s.isEmpty()) {
            System.out.println(str);
            return;
        }
        char ch = s.charAt(0);

        if (ch == 'a') {
            check2(str, s.substring(1));
        } else {
            check2(str + ch, s.substring(1));
        }
    }
}
