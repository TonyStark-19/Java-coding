import java.util.Scanner;

public class nSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int Sum = 0;
        for (int i = 1; i <= n; i++) {
            Sum += i;
        }

        System.out.println("Sum is : " + Sum);

        sc.close();
    }
}