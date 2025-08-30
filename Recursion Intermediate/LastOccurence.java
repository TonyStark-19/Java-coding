public class LastOccurence {
    // first and last index
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int idx, char element) {

        // base case
        if (idx == str.length()) {
            System.out.println("First index : " + first + " and last index : " + last);
            return;
        }

        // cuurent character
        char currChar = str.charAt(idx);

        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurence(str, idx + 1, element);
    }

    public static void main(String args[]) {
        String str = "baacdaefaah";
        findOccurence(str, 0, 'a');
    }
}