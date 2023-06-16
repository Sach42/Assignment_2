package searching_sorting.Assignment2;

public class problem4 {
    public static int CountSetBit(int n){
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(CountSetBit(n));
    }
}
