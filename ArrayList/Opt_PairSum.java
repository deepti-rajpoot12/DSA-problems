// 2 pointer approacg => 0(n)

import java.util.*;

public class Opt_PairSum {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp =0;
        int rp = list.size() -1 ;

        while(lp < rp){
            int sum = list.get(lp) + list.get(rp);
            
            //Case1
            if(sum == target){
                return true;
            }

            //case 2
            if(sum < target){
                lp++;
            } else{
                //case3
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); 

        int target = 1;
        System.out.println(pairSum(list, target));
    }
}
