package Functions;

import java.util.Scanner;

public class VoteEligibility {
    public static void checkVoteEligibility(int age) {
        if(age >= 18) {
            System.err.println("You can vote");
        } else {
            System.err.println("You cannot vote");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter your age : ");
        int age = sc.nextInt();

        checkVoteEligibility(age);

        sc.close();
    }
}