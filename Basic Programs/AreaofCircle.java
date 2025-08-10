import java.util.Scanner;

public class AreaofCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        float r = sc.nextInt();

        double area = 3.14 * r * r;

        System.out.print("Area of circle is : " + area);

        sc.close();
    }
}