
import java.util.Scanner;

public class CheckEven {
    public static boolean isEven(int num){
        if( num % 2 == 0){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(isEven(num)){
            System.out.println("Number is Even");
        } else{
            System.out.println("Number is odd");
        }
    }
}
