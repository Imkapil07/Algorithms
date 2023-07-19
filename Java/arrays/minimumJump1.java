//Jump Game I
public class minimumJump1 {
    public static boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        
        return lastPos == 0;
    }
    public static void main(String[] args) { 
        int[] arr ={2,1,3,1,4};
        System.out.println(canJump(arr));
    }
}
