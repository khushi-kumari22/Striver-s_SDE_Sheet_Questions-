public class comapreTo {
    public static void main(String[] args) {
            String str1 = "Learn Java";
            String str2 = "Learn Java";
            String str3 = "Learn Kolin";
            int result;

            // comparing str1 with str2
            result = str1.compareTo(str2);
            System.out.println(result);  // 0

            // comparing str1 with str3
            result = str1.compareTo(str3);
            System.out.println(result);  // -1

            // comparing str3 with str1
            result = str3.compareTo(str1);
            System.out.println(result);  // 1
            //str1 and str2 are equal. Hence, str1.compareTo(str2) returns 0.
            //str1 comes before str3 in the dictionary order, str1.compareTo(str3) returns negative
            //str3.compareTo(str1) returns positive.
    }
}
