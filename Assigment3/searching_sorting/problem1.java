package searching_sorting;


import java.util.Scanner;

public class problem1 {
 

        public static int findElementIndex(int[] arr, int x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return i;
                }
            }
            return -1; 
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
    
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array:");
    
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
    
            System.out.print("Enter the element to search: ");
            int x = scanner.nextInt();
    
            scanner.close();
    
            int index = findElementIndex(arr, x);
    
            if (index != -1) {
                System.out.println("Element found at index " + index);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    }