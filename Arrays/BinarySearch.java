public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            //comparison
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 20, 22};
        int key = 10;

        System.out.println("index of key is : "+ binarySearch(arr, key));
    }
}
