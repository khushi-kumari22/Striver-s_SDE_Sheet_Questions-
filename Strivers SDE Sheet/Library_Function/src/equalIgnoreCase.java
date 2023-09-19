public class equalIgnoreCase {
    public static void main(String[] args) {
        String str1 = "My name is Khushi";
        String str2 = "mY naME Is KhUshi";
        String str3 = "Java";

        System.out.println(str1.equalsIgnoreCase(str2)); //true

        System.out.println(str1.equalsIgnoreCase(str3)); //false
    }
}
