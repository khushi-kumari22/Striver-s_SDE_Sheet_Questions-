import java.util.Scanner;

public class SOL {
    public SOL() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long A = input.nextLong();
        Long B = input.nextLong();
        int ans = 1;

        for(int i = 2; i <= 7; ++i) {
            if (A / (long)i == 0L && B / (long)i == 0L) {
                ans *= i;
            }

            System.out.println(ans);
        }

    }
}
