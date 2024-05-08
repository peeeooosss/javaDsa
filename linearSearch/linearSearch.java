package linearSearch;


public class linearSearch {
    public static void main(String[] args) {

        int[] nums = {2,3,4,521,12,331,412,12};
        int target = 1;

        int ans = linearsearch(nums, target);
        int ans2 = linearsearch2(nums, target);
        boolean ans3 = linearsearch3(nums, target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);


    } 


    // searcj om the arrau return the index if item found
    // otherwiseee if item not found return -1
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;

        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }
    //show the element

    static int linearsearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;

        }

        for(int element : arr){
            if(element == target){
                return element;
            }

        }
        return Integer.MAX_VALUE; //to give the max value might be the -1 a element
    }
    //show in boolean
    static boolean linearsearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;

        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }

        }
        return false;
    }
}
