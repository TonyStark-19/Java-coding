package Functions;

import java.util.Scanner;

public class name {
    public static void printMyName(String name) {
        System.out.println("Your name is : " + name);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();

        printMyName(name);

        sc.close();
    }
}