import java.util.Arrays;
public class pairsOrTwoSum { 

    public static int[] twoSum(int arr[] , int target){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]+arr[j] == target){
                    return new int[] {i,j};
                }
            }          
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,13,15}; 
        int target = 99;  
        int ans[] = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));

    } 

}
