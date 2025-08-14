import java.util.Scanner;

public class CompareStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2 : ");
        String str2 = sc.nextLine();

        if (str1.compareTo(str2) > 0) {
            System.out.println("String 1 is greater than String 2");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("String 1 is smaller than String 2");
        } else {
            System.out.println("Both Strings are equal");
        }

        sc.close();
    }
}