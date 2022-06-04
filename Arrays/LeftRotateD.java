package Arrays;
import java.util.Arrays;
/*
* Left rotate an array by d places
* Eg:
* Inp: [1,2,3,4,5]
* Out: [3,4,5,1,2]
* */
public class LeftRotateD {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int d = 2;
        LeftRotate(arr, d);
    }

    private static void LeftRotate(int[] arr, int d){
        arr = reverse(arr, 0, d-1);
        arr = reverse(arr, d, arr.length - 1);
        arr = reverse(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

    private static int[] reverse(int[] arr, int left, int right){
        int temp;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
        return arr;
    }
}
