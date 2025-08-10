import java.util.Scanner;

class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.print("Sum is : " + sum);

        sc.close();
    }
}