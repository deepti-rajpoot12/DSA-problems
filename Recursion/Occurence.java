//For a given integer array of size N. You have to 
// find all the occurrences(indices) of a given element(Key) and print them.
// Use arecursive function to solve this problem.

public class Occurence {
    public static void printIndices(int arr[], int key, int idx){
        if(idx == arr.length ){
           return;
        }
        if(arr[idx] == key){
            System.out.print(idx +" ");
        }
        printIndices(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        printIndices(arr, key, 0);
    }
}
