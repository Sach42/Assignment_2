public class problem3 {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        for(int i=arr.length-1; i>=0; i--){
            int j = i;
            while(j>0 && arr[j] > arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
