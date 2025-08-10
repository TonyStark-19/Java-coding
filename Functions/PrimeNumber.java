package Functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void primeOrNOt(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("The number " + n + " is a prime number");
        } else {
            System.out.println("The number " + n + " is not a prime number");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        primeOrNOt(n);

        sc.close();
    }
}