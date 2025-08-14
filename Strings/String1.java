import java.util.Scanner;

public class String1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2 : ");
        String str2 = sc.nextLine();

        // concatination
        String str3 = str1 + " " + str2;

        System.out.println("\nString after concatination : " + str3);

        // length of string
        System.out.println("Lenght of new string : " + str3.length());

        // print each char of string
        System.out.println("List of chars of the string :\n");
        for (int i = 0; i < str3.length(); i++) {
            System.out.println(str3.charAt(i));
        }

        sc.close();
    }
}