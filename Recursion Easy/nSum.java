import java.util.Scanner;

public class nSum {
    public static int printSum(int n) {
        // base case
        if (n == 0) {
            return 0;
        }

        return n + printSum(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth value : ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Enter nth value greater than 1");
        } else {
            int sum = printSum(n);
            System.out.println("Sum is : " + sum);
        }

        sc.close();
    }
}