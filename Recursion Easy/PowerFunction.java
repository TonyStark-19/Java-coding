import java.util.Scanner;

// stack height = n
public class PowerFunction {
    public static int calculatePower(int x, int n) {
        // base case 1
        if (n == 0) {
            return 1;
        }

        // base case 2
        if (x == 0) {
            return 0;
        }

        return x * calculatePower(x, n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of base : ");
        int base = sc.nextInt();
        System.out.print("Enter the value of power : ");
        int power = sc.nextInt();

        if (base < 0 || power < 0) {
            System.out.println("Enter valid values only ( >= 0 )");
        } else {
            int ans = calculatePower(base, power);
            System.out.println(base + " to the power " + power + " is : " + ans);
        }

        sc.close();
    }
}