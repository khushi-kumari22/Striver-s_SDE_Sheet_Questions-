public class matches {
    public static void main(String[] args) {
        String regex = "^a...s$";

        String regex2 = "^[0-9]+$";

        System.out.println("abs".matches(regex)); // false
        System.out.println("alias".matches(regex)); // true
        System.out.println("an abacus".matches(regex)); // false
        System.out.println("abyss".matches(regex)); // true


        System.out.println("123a".matches(regex2)); // false
        System.out.println("98416".matches(regex2)); // true

        System.out.println("98 41".matches(regex2)); // false
    }
}
