package linearSearch;

public class FindMinAndMax{

    public static void main(String[] args) {
        int[] num = {2,33,24,6,7,21,44,1,66,4,2};
        System.out.println(min(num));  
        System.out.println(max(num));  
    }

    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length ; i++ ){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int max(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length ; i++ ){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
