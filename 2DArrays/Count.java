public class Count {
    public static int increaseCount(int matrix[][], int key){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(key == matrix[i][j]){
                   count++ ;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8},
                       {8, 8, 7}};
        int key = 3; 
        System.out.println(increaseCount(matrix, key));              
    }
}
