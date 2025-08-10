package Functions;

import java.util.Scanner;

public class Product {
    public static void CalculateProduct(int a, int b) {
        int prod = a * b;
        System.out.println("Product of a and b is : " + prod);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        CalculateProduct(a, b);

        sc.close();
    }
}