public class secondSmallestNum {
    public static int SecondMin(int[] arr){
        int smallest , secondSmallest ;
       smallest = secondSmallest = Integer.MAX_VALUE;

        for(int x : arr){
            if(x<smallest){
               secondSmallest = smallest;
                smallest = x;
            } else{
                if(x<secondSmallest && x != smallest){
                    secondSmallest = x;
                }
            }
        }
      return secondSmallest;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,1,5,1,8};
        System.out.println(SecondMin(arr));
        
    }
}
