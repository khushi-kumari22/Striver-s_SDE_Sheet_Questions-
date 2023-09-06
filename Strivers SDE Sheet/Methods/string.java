import java.util.Scanner;
public class string {
    public static void main(String[] args) {
       /* String message = greet();
        System.out.println(message);
    }
      static String greet(){
            String greeting = "how are you";
            return greeting;
        }*/


        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }


    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
}