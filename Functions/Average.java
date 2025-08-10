package Functions;

import java.util.Scanner;

public class Average {
    public static void calculateAverage(float a, float b, float c) {
        float avg = (a + b + c) / 3;
        System.out.println("Average of given 3 numbers is : " + avg);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 3 numbers : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        calculateAverage(a, b, c);

        sc.close();
    }
}