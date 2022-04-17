package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int[] nums = new int[]{12345,65475,776543998};
        for(int num: nums){
            System.out.println(num + ": " + sum(num));
        }
    }

    private static int sum(int num) {
        if(num <= 9){
            return num;
        }
        return num%10 + sum(num/10);
    }
}
