public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        int target = 4;

        int lastIndex = lastOccurrence(arr, target);

        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + target + " is at index " + lastIndex);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
