// WAP to check if an array is unique or not.  
public class uniqueArray {
    public static void main(String[] args) {
        uniqueArray u = new uniqueArray();
        int[] intArray = {1,2,3,4,5,6};
        boolean result = u.isUnique(intArray); 
        System.out.println(result);
        
    }
    public boolean isUnique(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        } 
        return true;
    }
}
