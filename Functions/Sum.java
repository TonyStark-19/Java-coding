package Functions;

import java.util.Scanner;

public class Sum {
    public static void CalculateSum(int a, int b) {
        int sum = a + b;
        System.out.print("Sum of a and b is : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        CalculateSum(a, b);

        sc.close();
    }
}