package binarySearch;

// ?? fix this code

public class infiniteArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16};
        int target = 8;
        System.out.println(ans(arr, target));
        
    }
    static int ans(int[] arr, int target){
        //first find the range
        int start = 0;
        int end = 1;
        //conditionfor the target to lie in the range;
        while(target > arr[end]){
            
            int newStart = end + 1;
            // doubke the box value
            end = end + (end - start +1) * 2;
            start = newStart;

        }return searchBinary(arr, target,start, end);
    }
    
    static int searchBinary(int[] arr, int target , int start, int end){
        
        while(start<=end){
            int mid = start + ( end - start)*2 ;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                
                return mid;
            }
        }return -1;
    }
}
