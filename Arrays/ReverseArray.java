package Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int[] reversedArray = getReversedArray(arr);
        for(int i: reversedArray){
            System.out.print(i);
        }
    }

    private static int[] getReversedArray(int[] arr) {
        int left = 0,right = arr.length - 1;
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
