import java.util.Scanner;

public class PrintNumbers {
    public static void printReverseNumbers(int n) {
        // base case
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printReverseNumbers(n - 1);
    }

    public static void printNumbers(int n, int end) {
        // base case
        if (n > end) {
            return;
        }

        System.out.print(n + " ");
        printNumbers(n + 1, end);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Print numbers");
        System.out.println("2. Print reverse numbers");
        System.out.print("Choose option : ");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.print("Enter starting point : ");
            int start = sc.nextInt();
            System.out.print("Enter ending point : ");
            int end = sc.nextInt();

            if (start > end) {
                System.out.println("Starting point must be less than or equal to the ending point!");
            } else {
                printNumbers(start, end);
            }
        } else if (option == 2) {
            System.out.print("Enter starting point : ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.print("Enter valid starting point (> 0)");
            } else {
                printReverseNumbers(n);
            }
        } else {
            System.out.println("Enter valid option :(");
        }

        sc.close();
    }
}