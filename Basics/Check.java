
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        do{
            System.out.println("enter your number :");
           int a = sc.nextInt();
           if( a % 10 == 0){
            break;
           } 
           System.out.print(a);
        } while(true);
       
    }
}
