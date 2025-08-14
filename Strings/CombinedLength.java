import java.util.Scanner;

public class CombinedLength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        String array[] = new String[size];
        int totalLength = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter String " + (i + 1) + " : ");
            array[i] = sc.next();

            totalLength += array[i].length();
        }

        System.out.println("Combined length of the added strings is : " + totalLength);

        sc.close();
    }
}