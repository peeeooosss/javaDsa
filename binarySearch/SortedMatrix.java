package binarySearch;
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5},
                          {6, 7, 8, 9,10},
                          {11, 12, 13, 14, 15}
                        };
        System.out.println(Arrays.toString(search(matrix, 9)));
        

    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row, mid};
            }
            else if(matrix[row][mid]<target){
                cStart = mid+1;
            }else{
                cEnd = mid-1;
            }
        }return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;

        if(row == 1){
            return binarySearch(matrix, row, row, col, target);
        }
        //run till 2 loops remaining
        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;

        while(rStart <(rEnd-1)){
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid]< target){
                rStart = mid;

            }else{
                rEnd = mid;
            }
        }
        //if target is in the first half
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart, cMid};
        }
        if(target >= matrix[rStart][cMid+1]&& target <= matrix[rStart][col-1]){
            return binarySearch(matrix, rStart, cMid+1, col, target);
        }
        if(target <= matrix[rStart +1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        } else{
            return binarySearch(matrix, rStart+1, cMid+1, col, target);
        }
    }
}
