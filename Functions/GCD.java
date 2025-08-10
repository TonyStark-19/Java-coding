package Functions;

import java.util.Scanner;

public class GCD {
    // Euclid's Algorithm
    public static int calculateGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.err.println("GCD of " + a + " and " + b + " is : " + calculateGCD(a, b));

        sc.close();
    }
}