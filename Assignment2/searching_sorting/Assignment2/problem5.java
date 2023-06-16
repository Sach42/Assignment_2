package searching_sorting.Assignment2;

public class problem5 {
    public static int findOddElement(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        int oddElement = findOddElement(arr);
        System.out.println("The odd appearing element is: " + oddElement);
    }
}