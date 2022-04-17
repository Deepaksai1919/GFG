package Recursion;

public class CheckPalindrome {
    public static void main(String[] args){
        String[] stringList = new String[]{"abba","a","abcd"};
        for(String str: stringList){
            System.out.println(str + ": " + check(str,0,str.length()-1));
        }
    }

    private static boolean check(String str, int start, int end) {
        if(start >= end){
            return true;
        }
        if(str.charAt(start) == str.charAt(end)){
            return check(str, start + 1, end - 1);
        }else{
            return false;
        }
    }
}
