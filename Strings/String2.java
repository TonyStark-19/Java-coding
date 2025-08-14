public class String2 {
    public static void main(String args[]) {
        String str1 = "123";
        // string to int parsing
        int number1 = Integer.parseInt(str1);
        System.out.println(number1);

        int number2 = 123;
        // int to string
        String str2 = Integer.toString(number2);
        System.out.println(str2.length());
    }
}