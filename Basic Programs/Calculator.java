import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operation lists: ");
        System.out.println("1: Additon");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Modulo or remainder");

        System.out.print("Choose Operation : ");
        int Operation = sc.nextInt();

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        switch (Operation) {
            case 1:
                int sum = a + b;
                System.out.print("Sum of a and b is : " + sum);
                break;

            case 2:
                int sub = a - b;
                System.out.print("Subtraction of a and b is : " + sub);
                break;

            case 3:
                int prod = a * b;
                System.out.print("Multiplication of a and b is : " + prod);
                break;

            case 4:
                int div = a / b;
                System.out.print("Division (quotient) of a and b is : " + div);
                break;

            case 5:
                int rem = a % b;
                System.out.print("Remainder of a divided by b is : " + rem);
                break;

            default:
                System.out.println("Invalid option :(");
        }

        sc.close();
    }
}