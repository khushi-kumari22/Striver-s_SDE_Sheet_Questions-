import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
//            sum();
//        }
//         static void sum() {
//            Scanner in = new Scanner(System.in);
//            System.out.println("enter number 1:");
//            int num1 = in.nextInt();
//            System.out.println("enter number 2:");
//            int num2 = in.nextInt();
//            int sum = num1 + num2;
//            System.out.println("sum:" + sum);
//        }
//    }


        int ans = sum2();
        System.out.println(ans);
    }

    //    return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = in.nextInt();
        System.out.println("enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
}

/*
public class sum {
    public static void main(String[] args) {

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
    */