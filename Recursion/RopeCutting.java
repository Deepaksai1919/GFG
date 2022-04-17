package Recursion;
/*
* A rope of length N is to be cut into pieces of lengths a, b, c only.
* Find the maximum numbers of ropes obtained after cutting.
* If there is no solution, return -1.
* Eg: N = 5, a = 2, b = 5, c = 1
* Ans: 5 (5 ropes of length 1 each)
* */
public class RopeCutting {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{5,2,5,1},{23,12,9,11},{5,4,2,6}};
        for(int[] num: nums){
            System.out.println(cutRope(num[0],num[1],num[2],num[3]));
        }
    }

    private static int cutRope(int N, int a, int b, int c) {
        if(N < 0){
            return -1;
        }else if(N == 0){
            return 0;
        }
        int res = Math.max(Math.max(cutRope(N-a,a,b,c), cutRope(N-b,a,b,c)), cutRope(N-c,a,b,c));
        if(res == -1){
            return -1;
        }
        return res + 1;
    }
}
