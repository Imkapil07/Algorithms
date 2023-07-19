// import java.util.HashSet;
// import java.util.Set;

public class findDuplicate { 

    public static void Duplicate(int[] arr){

        for(int i=0; i<arr.length; i++){
            int x = arr[i] % arr.length;
            arr[x] = arr[x] + arr.length;
        } 

        for(int i=0; i<arr.length; i++){
            if(arr[i]/arr.length >=2){
                System.out.print(i+" ");
            }
        }
    } 

    //  public static int containsDuplicate(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
        
    //     for (int i=0;i<nums.length;i++) {
    //         if (set.contains(nums[i])) {
    //             return nums[i]; // Found a duplicate
    //         }
    //         set.add(nums[i]); // Add the element to the set
    //     }
        
    //     return -1; // No duplicates found
    // }  


    // public static void printAllDuplicates(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
    //     Set<Integer> duplicates = new HashSet<>();

    //     for (int num : nums) {
    //         if (set.contains(num)) {
    //             duplicates.add(num);
    //         }
    //         set.add(num);
    //     } 

    //     System.out.println(duplicates+" ");
    //     }

    public static void main(String[] args) {
        int[] arr= {2,1,0,3,1,4,3,0};
        Duplicate(arr);

    }
}
