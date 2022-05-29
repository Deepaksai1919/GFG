package Arrays;

/*
Program to find the second largest element of the given input array
* */
public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {1,1,1,1,0};
        int secondLargest = getSecondLargest(arr);
        System.out.println(secondLargest);
    }

    public static int getSecondLargest(int[] arr){
        int first;
        int second = -1;
        if(arr.length < 2) return -1;
        first=arr[0];
        for(int i: arr){
            if(i>first){
                second = first;
                first = i;
            }else if(i < first){
                if(second == -1 || i > second){
                    second = i;
                }
            }
        }
        return second;
    }
}
