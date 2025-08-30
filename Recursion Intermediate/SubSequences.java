public class SubSequences {
    public static void subsequences(String str, int idx, String newString) {
        // base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // choice to be
        subsequences(str, idx + 1, newString + currChar);
        // choice not to be
        subsequences(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}