import java.util.Scanner;


public class SimpleMethod2 {
    public static int square(int bruh) {
        return bruh*bruh;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(SimpleMethod2.square(input));
    }
}