public class maxMinArrayEle {
    
    public static void MinMAx(int[] arr){
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE; 
       int n = arr.length;
       
       for(int i=0; i<n; i++){
          if(arr[i] > max){
            max = arr[i];
          }
          if(arr[i] < min){
            min = arr[i];
          }         
       }
       System.out.println(max +" "+min);
     
    }
    public static void main(String[] args) {
        int[] arr = {};
        MinMAx(arr);
    }
}
