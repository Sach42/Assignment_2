package searching_sorting.Assignment2;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 32;

       System.out.println(ispowof2(n));
        
    }
    public static boolean ispowof2(int n){
        if (n == 0)
        return false;

    while (n != 1) {
        if (n % 2 != 0)
            return false;
        n = n / 2;
    }
    return true;
    }
}
