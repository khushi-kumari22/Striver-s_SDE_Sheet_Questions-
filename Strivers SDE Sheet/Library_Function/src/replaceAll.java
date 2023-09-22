public class replaceAll {
    public static void main(String[] args) {
        String str1 = "aabcdaacda";
        String str2 = "88784Khushi78";
        String regex = "\\d+";

        System.out.println(str1.replaceAll("aa", "zz"));
        System.out.println(str2.replaceAll(regex, " "));
        // or, System.out.println(str2.replaceAll("\\d+", " "));
    }
}
// regex - a regex (can be a typical string) that is to be replaced
