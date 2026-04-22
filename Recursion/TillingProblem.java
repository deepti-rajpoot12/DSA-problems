public class TillingProblem {
    public static int tillingProblem(int n){ // 2 X n (floor Size)
        //base case
        if(n ==0 || n == 1){
            return 1;
        }
        //kaam 
        //vertical choice 
        int fnm1 = tillingProblem(n-1);

        //horizontal choice
        int fnm2 = tillingProblem(n-2);

        return fnm1 + fnm2 ;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(5));
    }
}
