package Recursion;

public class GenerateSubsets {
    public static void main(String[] args) {
        String[] strings = new String[]{"ab","abc"};
        for(String str: strings){
            subset(str, "", 0);
        }
    }

    private static void subset(String str, String curr, int i) {
        if(i == str.length()){
            System.out.println(curr);
            return;
        }
        subset(str, curr, i+1);
        subset(str, curr + str.charAt(i), i+1);
    }
}
