public class textSplit {
    public static void main(String[] args) {
        String text = "Java is a fun programming language";

        // split string from space
        String[] result = text.split("");
        String[] result2 = text.split(" ");

        System.out.print("result = ");
        for (String str : result) {
            System.out.print(str + ", ");
        }
        System.out.println();

        for (String str : result2) {
            System.out.print(str + ", ");
        }
    }
}
