public class Subarrays {
    public static void printSubarrays(int num[]){
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                int sum= 0;
                for(int k=start; k<=end; k++){
                    sum = sum + num[k];
                    System.out.print(num[k]+" ");
                }
                System.out.println();
                
                System.out.println("sum of subArray is " + sum);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        printSubarrays(num);
    }
}
