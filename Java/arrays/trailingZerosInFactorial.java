public class trailingZerosInFactorial {

    public static int TrailZero(int n){
      int count = 0;
      while(n>=5){
        n/=5;
        count+=n;
      }
      return count;
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(TrailZero(n));
    }
}
