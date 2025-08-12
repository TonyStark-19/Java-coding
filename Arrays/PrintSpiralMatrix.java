package Arrays;

import java.util.Scanner;

public class PrintSpiralMatrix {
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

        int rowStart = 0, rowEnd = rows - 1, colStart = 0, colEnd = cols - 1;

        System.out.print("\nThe Spiral Order Matrix is :\n");

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 1
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // 2
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            // 3
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }

        sc.close();
    }
}