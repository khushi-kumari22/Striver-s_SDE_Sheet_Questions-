public class endsWith {
    public static void main(String[] args) {

        String str = "Java Programming";

        System.out.println(str.endsWith("mming")); // true
        System.out.println(str.endsWith("g")); // true
        System.out.println(str.endsWith("a Programming")); // true

        System.out.println(str.endsWith("programming")); // false
        System.out.println(str.endsWith("Java")); // false
    }
}
