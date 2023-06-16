public class CountOnes {
    public static int countOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Binary search to find the first occurrence of 1
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == 0) {
                left = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] == 0) {
                    return arr.length - mid;
                } else {
                    right = mid - 1;
                }
            }
        }

        return 0; // No 1's found
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int[] arr2 = {0, 0, 0, 0, 0, 1, 1};

        int count1 = countOnes(arr1);
        int count2 = countOnes(arr2);

        System.out.println("Output 1: " +
