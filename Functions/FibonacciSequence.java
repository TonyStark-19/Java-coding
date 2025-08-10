package Functions;

import java.util.Scanner;

public class FibonacciSequence {
    public static void printFibonacci(int n) {
        int a = 0, b = 1, c;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the nth term : ");
        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
}