public class startWith {
    public static void main(String[] args) {
        String str = "Java Programming";

        String str2 = "Java Programming";

        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java Program")); // true

        System.out.println(str.startsWith("java")); // false
        System.out.println(str.startsWith("ava")); // false


        // checks in substring "a Programming"
        System.out.println(str2.startsWith("Java", 3)); // false
        System.out.println(str2.startsWith("a Pr", 3)); // true
    }
}
