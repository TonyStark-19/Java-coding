package Functions;

import java.util.Scanner;

public class GreaterNumber {
    public static void findGreaterNumber(int a, int b) {
        if (a > b) {
            System.out.print(a + " is greater number");
        } else if (a < b) {
            System.out.print(b + " is greater number");
        } else {
            System.out.print("Both are equal numbers");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        findGreaterNumber(a, b);

        sc.close();
    }
}