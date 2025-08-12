package Arrays;

import java.util.Scanner;

public class SearchNumberInMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter size of rows and column : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.err.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.err.print("Enter row " + (i + 1) + " element : " + (j + 1) + " : ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nMatrix representation :\n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.err.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter the number value to be searched : ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x) {
                    System.out.print("Number is found at row " + (i + 1) + " and column " + (j + 1));
                    found = true;
                }
            }
            System.out.println();
        }

        if (!found) {
            System.out.print("Number not found :(");
        }

        sc.close();
    }
}