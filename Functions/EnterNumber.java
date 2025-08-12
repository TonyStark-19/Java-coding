package Functions;

import java.util.Scanner;

public class EnterNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter 1 to start and 0 to stop : ");
        int input = sc.nextInt();

        int positive = 0, negative = 0, zero = 0;

        while (input == 1) {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();

            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }

            System.err.print("Enter 1 to start and 0 to stop : ");
            input = sc.nextInt();
        }

        System.out.println("\nPositive numbers entered : " + positive);
        System.out.println("Negative numbers entered : " + negative);
        System.out.println("Zero entered : " + zero);

        sc.close();
    }
}