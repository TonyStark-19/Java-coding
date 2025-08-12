package Arrays;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 33, 44, 23, 12, 16, 78, 90, 76, 55, 1 };

        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                System.out.println("Number found at index : " + i);
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Number not found :(");
        }

        sc.close();
    }
}