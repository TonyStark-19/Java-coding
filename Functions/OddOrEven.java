package Functions;

import java.util.Scanner;

public class OddOrEven {
    public static void checkOddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println("The number " + n + " is even number");
        } else {
            System.out.println("The number " + n + " is odd number");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        checkOddOrEven(n);

        sc.close();
    }
}