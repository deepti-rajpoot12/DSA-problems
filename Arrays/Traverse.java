public class Traverse {
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5, 0, 0};
        int key = 6;
        // int temp = key;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            arr[i] = key;
            key = curr;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
