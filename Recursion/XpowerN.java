public class XpowerN {
    public static int print(int x, int n){
        if( n == 0){
            return 1;
        }
        // int xnm1 = print(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * print(x, n-1); 
    }
    public static void main(String[] args) {
        int x = 2;
        System.out.println(print(x, 10));
    }
}
