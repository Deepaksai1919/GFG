package Arrays;
/*
A function that moves all the zeroes in array to the end and preserves the order of other elements.
Eg.
IP: [8,5,0,10,0]
OP: [8,5,10,0,0]
* */
public class MoveZeroes {
    public static void main(String[] args){
        int[] arr = {0,0,0,8,5,0,101,0,0,0};
        int[] newArr = moveZeroes(arr);
        for(int i: newArr){
            System.out.print(i);
        }
    }

    private static int[] moveZeroes(int[] arr){
        int count = 0;
        int temp;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                if(count != i){
                    temp = arr[i];
                    arr[i] = arr[count];
                    arr[count] = temp;
                }
                count ++;
            }
        }
        return arr;
    }
}
