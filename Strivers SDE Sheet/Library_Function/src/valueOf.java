public class valueOf {
    public static void main(String[] args) {

    // Example: Java String valueOf() for Numbers
        int a = 5;
        long l = -2343834L;
        float f = 23.4f;
        double d = 923.234d;

        // convert numbers to strings
        System.out.println(String.valueOf(a));  // "5"
        System.out.println(String.valueOf(l));  // "-2343834"
        System.out.println(String.valueOf(f));  // "23.4"
        System.out.println(String.valueOf(d));  // "923.234"

     // Example 2: Convert char and char array to String
        char c = 'J';
        char ch[] = {'J', 'a', 'v', 'a'};

        // convert char to string
        System.out.println(String.valueOf(c));  // "J"

        // convert char array to string
        System.out.println(String.valueOf(ch));  // "Java"


    // Example 3: Subarray of a char Array to String
        char cha[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        int offset = 2;
        int length = 5;
        String result;

        // subarray {'o', 'g', 'r', 'a'} is converted to string
        result = String.valueOf(cha, offset, length);

        System.out.println(result);  // "ogra"
    }
}
