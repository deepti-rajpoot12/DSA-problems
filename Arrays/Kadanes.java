// it is used to get max sum of subarray by using kadanes algorithm 
// with time complexity => 0(n)
public class Kadanes {
    public static void maxSubarraySum(int num[]){
      int cs = 0;
      int ms = Integer.MIN_VALUE;

      for(int i=0; i<num.length; i++){
        cs = cs + num[i];
        
        ms = Math.max(cs, ms);
        if(cs < 0){
            cs = 0;
        }
      }
      System.out.println("max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int num[] ={-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubarraySum(num);
    }
}
