public class indexOf {
    public static void main(String[] args) {
        String str1 = "Learn Java";

        int result = str1.indexOf('L');
        System.out.println(result);

        result = str1.indexOf("ava");
        System.out.println(result); // 7

        // substring not in the string
        result = str1.indexOf("java");
        System.out.println(result); // -1
    }
}
