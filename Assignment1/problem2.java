public class problem2 {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            for(int j=arr.length-1; j>0; j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
