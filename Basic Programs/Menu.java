import java.util.Scanner;

public class Menu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to start entering marks out of 100\nand 0 to stop!!");
        System.out.print("Your response : ");
        int n = sc.nextInt();

        do {
            System.out.print("Enter marks : ");
            n = sc.nextInt();

            if (n >= 90) {
                System.out.println("This is good!!\n");
            } else if (n <= 89 && n >= 60) {
                System.out.println("This is also good!\n");
            } else if (n <= 59 && n >= 0) {
                System.out.println("This is good as well\n");
            }
        } while (n != 0);

        sc.close();
    }
}