import java.util.*;

public class join {
    public static void main(String[] args) {
        String str1 = "I";
        String str2 = "love";
        String str3 = "Java";

        // join strings with space between them
        String joinedStr = String.join(" ", str1, str2, str3);
        System.out.println(joinedStr);


    // Example 1: Java String join() With CharSequence()
        String result;

        result = String.join("-", "Java", "is", "fun");
        System.out.println(result);  // Java-is-fun


    // Example 2: Java String join() With Iterable
        ArrayList<String> text = new ArrayList<>();
        // adding elements to the arraylist
        text.add("Java");
        text.add("is");
        text.add("fun");

        String result2;

        result2 = String.join("-", text);

        System.out.println(result2);  // Java-is-fun
    }
}
