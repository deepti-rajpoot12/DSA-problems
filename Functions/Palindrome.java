import java.util.*;
public class Palindrome {

    public static boolean isPalindrome(int num){
        int reverse = 0;
        int palindrome = num;
        while( palindrome != 0){
            int rem = palindrome% 10;
            reverse = reverse * 10 + rem;
            palindrome = palindrome/ 10;
        }
        if ( num == reverse){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Please Enter a number :");
        Scanner sc=new Scanner(System.in);
        int palindrome=sc.nextInt();
        if(isPalindrome(palindrome)) {
            System.out.println("Number : "+palindrome+" is a palindrome");
        } else{
            System.out.println("Number : "+palindrome+" is not a palindrome");
        }}
    }

