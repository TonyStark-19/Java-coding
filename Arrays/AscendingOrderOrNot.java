package Arrays;

import java.util.Scanner;

public class AscendingOrderOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.err.print("Enter number : ");
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("\nThe array is sorted in ascending order");
        } else {
            System.out.println("\nThe array is not sorted in ascending order");
        }

        sc.close();
    }
}