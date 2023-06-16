package searching_sorting.Assignment2;
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Stack<Integer> st = new Stack<>();
 
        while (num > 0) {
           
            st.push(num % 2);
            num = num / 2;
        }
 
        while (!(st.isEmpty())) {
           
            System.out.print(st.pop());
        }

    }
}
