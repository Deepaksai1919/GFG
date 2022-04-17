package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 5;
        TOH(n,'A','B','C');
    }

    private static void TOH(int n, char A,char B, char C) {
        if(n == 1){
            System.out.println("Move " + n + " from " + A + " to " + C);
            return;
        }
        TOH(n-1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        TOH(n-1, B, A, C);
    }
}
