// Time Complexity => 0(n^2)

import java.util.*;
public class Prefixsum {
    public static void maxSubarraySum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        //calculate prefix of arrary
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
                
            }

        }
        System.out.println("max sum of subArray is " + maxSum);

    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        maxSubarraySum(num);
    }

}
