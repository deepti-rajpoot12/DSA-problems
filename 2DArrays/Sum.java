//ptont out the sum of 2nd row in nums array

public class Sum {
    public static int printSum(int nums[][]){
        int sum = 0;
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j] ;
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[][] = {{1, 4, 9},
                       {11, 4, 3},
                       {2, 2, 3} };
        System.out.println("sum of second row of the nums is " + printSum(nums));               

    }
}
