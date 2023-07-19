import java.util.Arrays;

public class permutationArray2 { 

    public static boolean permutation2(String arr1[] , String arr2[]){
        if(arr1.length != arr2.length){
            return false;
        }  

        Arrays.sort(arr1);
        Arrays.sort(arr2); 

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        
        String[] arr1 = {"apple", "banana", "cherry"};
        String[] arr2 = {"cherry", "banana", "apple"};

        if(permutation2(arr1,arr2)){
            System.out.println("The arrays are permutations of each other.");
        } else {
            System.out.println("The arrays are not permutations of each other.");
        }

        
    }
}
