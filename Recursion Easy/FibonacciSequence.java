import java.util.Scanner;

public class FibonacciSequence {
    public static void printFib(int a, int b, int n) {
        // base case
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth value : ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        if (n == 1) {
            System.out.print(a + " ");
        } else if (n == 2) {
            System.out.print(a + " ");
            System.out.print(b + " ");
        } else if (n <= 0) {
            System.out.println("Enter valid value only ( > 0)");
        } else {
            System.out.print(a + " ");
            System.out.print(b + " ");
            printFib(a, b, n - 2);
        }

        sc.close();
    }
}