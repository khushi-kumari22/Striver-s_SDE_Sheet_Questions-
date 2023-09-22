import java.sql.SQLOutput;

public class intern {
    public static void main(String[] args) {
        String str1 = "Khushi";
        String str2 = "Khushi";
        System.out.println(str1 == str2); // true

     // If you create strings with using the new keyword,
     // these strings won't share the same memory,
        String str3 = new String("xyz");
        String str4 = new String("xyz");

        System.out.println(str3 == str4); // false


    // you can manually use the intern() method so that
     // the same memory is used for strings having the same content.
        String str5 = new String("xyz");
        String str6 = new String("xyz");

        // str1 and str2 doesn't share the same memory pool
        System.out.println(str5 == str6); // false

        // using the intern() method
        // now both str1 and str2 share the same memory pool
        str5 = str5.intern();
        str6 = str6.intern();

        System.out.println(str5 == str6); // true
    }
}
