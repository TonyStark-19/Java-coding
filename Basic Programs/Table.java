import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        System.out.println(1 * n);
        System.out.println(2 * n);
        System.out.println(3 * n);
        System.out.println(4 * n);
        System.out.println(5 * n);
        System.out.println(6 * n);
        System.out.println(7 * n);
        System.out.println(8 * n);
        System.out.println(9 * n);
        System.out.println(10 * n);

        sc.close();
    }
}