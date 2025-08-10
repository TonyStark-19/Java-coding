package Functions;

import java.util.Scanner;

public class OddSum {
    public static void calculateSumOfOdd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.print("Sum of odd numbers between 1 to " + n + " is : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        calculateSumOfOdd(n);

        sc.close();
    }
}