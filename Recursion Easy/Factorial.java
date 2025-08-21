import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial(int n) {
        // base case
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter valid number ( > 0 ) only");
        } else {
            int ans = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is : " + ans);
        }

        sc.close();
    }
}