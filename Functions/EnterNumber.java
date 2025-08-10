package Functions;

import java.util.Scanner;

public class EnterNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0, i = 0;
        do {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();

            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }
            i++;
        } while (i != 10);

        System.out.println("\nPositive numbers entered : " + positive);
        System.out.println("Negative numbers entered : " + negative);
        System.out.println("Zero entered : " + zero);

        sc.close();
    }
}