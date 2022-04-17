package Recursion;

public class PrintSeries {
    public static void main(String[] args){
        int n = 5;
        RecursiveOneToNFunction(n);
        System.out.print('\n');
        RecursiveNToOneFunction(n);
    }

    private static void RecursiveNToOneFunction(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n);
        RecursiveNToOneFunction(n-1);
    }

    private static void RecursiveOneToNFunction(int n) {
        if(n == 0){
            return;
        }
        RecursiveOneToNFunction(n-1);
        System.out.print(n);
    }
}
