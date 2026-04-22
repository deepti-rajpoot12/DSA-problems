public class Distinct {
    public static boolean distinctNum(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 9, 3, 4};    
        System.out.println(distinctNum(arr) );
    }
}
