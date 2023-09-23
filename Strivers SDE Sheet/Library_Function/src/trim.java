public class trim {
    public static void main(String[] args) {
        String str1 = "     Learn   Java Programming ";
        String str2 = "Learn\nJava Programming\n\n   ";
        String str3 = "Learn\nJava \n\n   ";
        String result;

        System.out.println(str1.trim());
        System.out.println(str2.trim());

        // replace all whitespace characters with empty string
        result = str3.replaceAll("\\s", "");
        System.out.println(result);   // LearnJava

    }
}
