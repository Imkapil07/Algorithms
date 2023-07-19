import java.util.Arrays;

public class reverseArray {
     public static void Reverse(int[] arr){

        int first=0, last = arr.length -1; 
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp; 
            first++;
            last--;
        }

    }
   public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,9};
    Reverse(arr);
    System.out.println(Arrays.toString(arr));
   }
}
