package searching_sorting.Assignment2;

public class problem3 {
    public static void main(String[] args) {
        int n = 14;
        System.out.print(isEven(n) == true ? "Even"
                                           : "Odd");
    }
    public static boolean isEven(int n)
    {
        return ((n & 1) != 1);
    }
}
