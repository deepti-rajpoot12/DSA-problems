import java.util.*;
public class Basics {
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] == key){
                System.out.println("found at the cell(" + i +","+ j +")");
                return true;
            }
        }
    }
    return false;
        
}

public static void largestEle(int matrix[][]){
    int largest = Integer.MIN_VALUE;
    int row = -1;
    int col = -1;
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] > largest){
                largest = matrix[i][j];
                row = i;
                col = j;
            }
            
        }
    }
    System.out.println("Largest element is :" + largest);
    System.out.println("at index: (" + row + "," + col+")");
}
    
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        largestEle(matrix);
    }
}
