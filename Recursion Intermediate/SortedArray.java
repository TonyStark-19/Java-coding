public class SortedArray {
    public static boolean isSOrted(int arr[], int idx) {
        // base case
        if (idx == arr.length - 1) {
            return true;
        }

        // is array sorted (Strictly increasing)
        if (arr[idx] < arr[idx + 1]) {
            // array is sorted till now
            return isSOrted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 3, 5, 7 };
        System.out.println(isSOrted(arr1, 0));

        int arr2[] = { 1, 3, 3, 7 };
        System.out.println(isSOrted(arr2, 0));
    }
}