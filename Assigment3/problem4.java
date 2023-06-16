public class CountOccurrences {
    public static int countOccurrences(int[] nums, int target) {
        int firstIndex = findFirstIndex(nums, target);
        if (firstIndex == -1) {
            return 0; // Target not found
        }
        int lastIndex = findLastIndex(nums, target);
        return lastIndex - firstIndex + 1;
    }

    public static int findFirstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                firstIndex = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return firstIndex;
    }

    public static int findLastIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                lastIndex = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastIndex;
    }

    public static void main(String[] args) {
        int[] nums = {2, 
