import java.util.ArrayList;
import java.util.Scanner;

public class multiArrayList {
    public multiArrayList() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList();

        int i;
        for(i = 0; i < 3; ++i) {
            list.add(new ArrayList());
        }

        for(i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                ((ArrayList)list.get(i)).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
