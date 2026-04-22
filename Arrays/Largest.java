
public class Largest {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest ;
    }
    public static void main(String[] args) {
        int numbers[] = {3, 8, 9, 14, 7, 1};
        System.out.println("largest value is" + getLargest(numbers));
    }
}
