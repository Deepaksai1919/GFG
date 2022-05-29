package Arrays;
/*
Program to move the duplicate elements of the array to the end and give the size of result array
Eg.
IP = [10,10,20,20,20,30,30,30], size = 7
OP = [10,20,30,...], size = 3
* */
public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {10,10,20,20,20,30,30,30,40,45,50};
        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr){
        int index = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[index-1] != arr[i]){
                arr[index] = arr[i];
                index ++;
            }
        }
        index --;
        for(int i: arr){
            System.out.print(i);
            if(index < 1) break;
            index --;
        }
    }
}
