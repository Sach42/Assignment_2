public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        int num = 16;
        boolean isSquare = isPerfectSquare(num);
        System.out.println(isSquare); // Output: true
    }
}
