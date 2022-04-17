package Recursion;

public class Josephus {
    public static void main(String[] args) {
        int n = 100, k = 2;
        System.out.println(solveIterative(n, k));
        System.out.println(solveRecursive(n, k));
    }

    private static int solveRecursive(int n, int k) {
        if(n == 1){
            return 0;
        }
        return (solveRecursive(n-1, k) + k) % n;
    }

    private static int solveIterative(int n, int k) {
        if(k == 1){
            return n-1;
        }
        boolean[] people = new boolean[n];
        for(int i = 0; i < n; i++){
            people[i] = true;
        }
        int j = 1, total = n;
        while(total != 1){
            for(int i = 0; i < n; i++){
                if(people[i]){
                    if(j == k) {
                        people[i] = false;
                        j = 1;
                        total-=1;
                    }else{
                        j++;
                    }
                }
            }
        }
        int index = -1;
        for(int i = 0; i < n; i++){
            if(people[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
