package binarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3,65,32,5,1,78,6,7};
        int target = 78;
        System.out.println(BinarySearch(arr, target));
        
    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;  // only start + end will exeed th int range

            if (target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                
                return mid;
            }
        }
            return -1;
    }

}
