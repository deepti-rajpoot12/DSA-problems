public class FirstOccurence {
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 6, 8, 9, 10, 8};
        System.out.println(firstOccurence(arr, 8, 0));
    }
}
