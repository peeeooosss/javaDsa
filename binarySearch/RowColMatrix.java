package binarySearch;
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, 
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                    };
        int target = 7;
        System.out.println(Arrays.toString(search(matrix, target)));
        
    }
    static int[] search(int[][] arr, int target){
        int[] ans = {-1,-1};
        int row = 0;
        int col = arr[0].length-1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            else if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
            }return ans;
            
    }
}
