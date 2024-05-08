package linearSearch;

import java.util.Arrays;

public class Searchin2Darrays {
    public static void main(String[] args) {
        
        int[][] arr = {
                {1,2,5,6},
                {3,4,7,8},

                {9,10,11,12}

        };
        int target = 7; //0 1 2 3 index
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                if (arr[row][col] == target)
                {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }


}
