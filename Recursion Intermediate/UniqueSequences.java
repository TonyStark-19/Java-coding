import java.util.HashSet;

public class UniqueSequences {
    public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> Set) {
        // base case
        if (idx == str.length()) {
            if (Set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                Set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        // choice to be
        uniqueSubsequences(str, idx + 1, newString + currChar, Set);
        // choice not to be
        uniqueSubsequences(str, idx + 1, newString, Set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(str, 0, "", set);
    }
}