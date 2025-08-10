package Functions;

import java.util.Scanner;

public class Factorial {
    public static void CalculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number :(");
            return;
        }

        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }

        System.out.println("Factorial of " + n + " is : " + prod);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        CalculateFactorial(n);

        sc.close();
    }
}