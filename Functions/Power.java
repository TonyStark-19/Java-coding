package Functions;

import java.util.Scanner;

public class Power {
    public static void calculatePower(int base, int power) {
        int ans = 1;
        for (int i = 1; i <= power; i++) {
            ans *= base;
        }

        System.err.println(base + " to the power " + power + " is : " + ans);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter value of base : ");
        int base = sc.nextInt();
        System.err.print("Enter value of power : ");
        int power = sc.nextInt();

        calculatePower(base, power);

        sc.close();
    }
}