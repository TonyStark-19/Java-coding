package Arrays;

import java.util.Scanner;

public class Transpose {
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

        System.out.println("\nTranspose of matrix :\n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.err.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();;
    }
}