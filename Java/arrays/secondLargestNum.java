public class secondLargestNum { 

    // // Approach 1 : Not good for Duplicate -->
    // public static void SecondLarg(int[] arr){
    //     int n = arr.length;
    //     Arrays.sort(arr);  
    //     for(int i=0 ; i<arr.length;i++){
    //         System.out.println(arr[i]+" ");
    //     }
    //     System.out.println("Second largest number : "+arr[n-2]);
    // } 

    // Approach 2 O(nlogn).
    // public static int SecondLarg(int[] arr){
    //     Arrays.sort(arr);
    //     for(int i = arr.length-1 ; i>0 ; i--){
    //         if(arr[i] != arr[i-1]){
    //          return arr[i-1];
    //         }
    //     }
    //     return Integer.MIN_VALUE;
    // }

    //Approach 3 Best optimal solution
    public static int SecondLarg(int[] arr){
        int largest , secondLargestNum ;
        largest = secondLargestNum = Integer.MIN_VALUE;

        for(int x : arr){
            if(x>largest){
                secondLargestNum = largest;
                largest = x;
            } else{
                if(x>secondLargestNum && x != largest){
                    secondLargestNum = x;
                }
            }
        }
      return secondLargestNum;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,8};
        // int[] negArr={-1,-4,-6,2,1}; 
        // int[] dupArr = {3,5,2,2,5,6,5,6};
        // int[] sameEl ={4,4,4,4,4};
        System.out.println(SecondLarg(arr));
         
    }
}
