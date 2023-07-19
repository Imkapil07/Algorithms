import java.util.Arrays;

public class rotateArrayByK {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Adjust k if it is greater than n
        
        reverse(nums, 0, n - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the remaining elements
    }
    
     static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        
        System.out.println("Original array: " + Arrays.toString(nums));
        rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}
