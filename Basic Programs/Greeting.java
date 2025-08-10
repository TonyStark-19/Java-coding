import java.util.Scanner;

public class Greeting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose options (1 2 3 4) : ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Hello!");
                break;

            case 2:
                System.out.println("Namaste!");
                break;

            case 3:
                System.out.println("Bonjour!");
                break;

            case 4:
                System.out.println("Hola!");
                break;

            default:
                System.out.println("Invalid option :(");
        }

        sc.close();
    }
}