//Print Revere of number

public class Reverse {
    public static void main(String[] args) {
        int n =17890;
        
        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
        System.out.println();
    }
}
