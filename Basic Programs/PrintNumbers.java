public class PrintNumbers {
    public static void main(String args[]) {
        // for loop
        System.out.println("for loop :");
        for (int i = 0; i <= 10; i++) {
            System.err.print(i + " ");
        }

        // while loop
        System.out.println("\nwhile loop :");
        int j = 0;
        while (j <= 10) {
            System.err.print(j + " ");
            j++;
        }

        // do while loop
        System.out.println("\ndo while loop :");
        int k = 0;
        do {
            System.err.print(k + " ");
            k++;
        } while (k <= 10);
    }
}