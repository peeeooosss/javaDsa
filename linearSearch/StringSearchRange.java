package linearSearch;

public class StringSearchRange {

    public static void main(String[] args) {
        int[] arr = {21,23,34,14,34,66,123,5,1,4,6,54};
        int search = 34;

        System.out.println(search(arr,search,0,4));
        System.out.println(search2(arr,search,0,4));
    }
    //to search the index in range

    static int search(int[] arr, int target, int start, int end){
        
        if(arr.length == 0 ){
            return -1;
        }

        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }

    //using while loop
    static int search2(int[] arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;
        }
        while(start <= end){
            if (target == arr[start]) {
                return start;
            } else {
                start++ ;
            }
        }
        return -1;
    
    
    }

}
