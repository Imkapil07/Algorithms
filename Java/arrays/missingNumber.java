public class missingNumber {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,8,9,10}; 
        missingNum(arr);
    } 

    public static void missingNum(int arr[]){
   
        int sum1 = 0;
        int sum2 = 0;

        for(int i : arr){
            sum1 += i;
        } 
   
            sum2 =  10*(10+1)/2;
            int diffrence = sum2 - sum1;

            System.out.println("The missing Number is :" +diffrence);
    }
}
