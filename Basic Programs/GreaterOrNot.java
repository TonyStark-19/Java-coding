import java.util.Scanner;

public class GreaterOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("Both are equal");
        }

        sc.close();
    }
}