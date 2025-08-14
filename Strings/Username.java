import java.util.Scanner;

public class Username {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email : ");
        String email = sc.next();

        String userName = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }

        System.out.print("Your UserName is : " + userName);

        sc.close();
    }
}