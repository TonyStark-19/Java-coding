import java.util.Scanner;

public class Table2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");
        }

        sc.close();
    }
}