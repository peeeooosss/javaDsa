package linear;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        
        String name = "PiyushBhuyan";
        char target = 'h';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name, target));
        System.out.println(search3(name, target));



    }    
    //same method there are 2 ways
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    //to show the index
    static int search3(String str, char target){
        if(str.length() == 0){
            return -1;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;

    }

}
