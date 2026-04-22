import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter the value of positive");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1 ;
        
            for(int i=n; i>=1; i--){
                factorial = factorial*i;
            }
            System.out.println("factorial of n is"+" " + factorial);
        
    }
}
