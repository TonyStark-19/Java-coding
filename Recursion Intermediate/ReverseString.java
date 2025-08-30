import java.util.Scanner;

public class ReverseString {
    public static void printReverse(String str, int idx) {
        // base case
        if (idx == 0) {
            System.out.print(str.charAt(idx) + "");
            return;
        }

        System.out.print(str.charAt(idx) + "");
        printReverse(str, idx - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string : ");
        String str = sc.next();

        printReverse(str, str.length() - 1);

        sc.close();
    }
}