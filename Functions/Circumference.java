package Functions;

import java.util.Scanner;

public class Circumference {
    public static void circumferenceOfCircle(float radius) {
        float Circumference = (2 * 22 * radius) / 7;
        System.out.println("The circumference of circle is : " + Circumference);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the radius of circle : ");
        float r = sc.nextFloat();

        circumferenceOfCircle(r);

        sc.close();
    }
}