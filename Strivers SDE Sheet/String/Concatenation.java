import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String first = input1.nextLine();

        System.out.println("Enter second name: ");
        String second = input2.nextLine();

        String fullName = first + second;
        System.out.println(fullName.length());

        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
