import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }

        System.out.print("Final string after replacing : " + result);

        sc.close();
    }
}