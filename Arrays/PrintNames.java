package Arrays;

import java.util.Scanner;

public class PrintNames {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        String names[] = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name : ");
            names[i] = sc.next();
        }

        System.err.print("\nList of names : ");
        for (int i = 0; i < size; i++) {
            System.out.print(names[i] + " ");
        }

        sc.close();
    }
}