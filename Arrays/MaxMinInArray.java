package Arrays;

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the size of array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.err.print("Enter number : ");
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nMax value is : " + max + " and Min value is : " + min);

        sc.close();
    }
}