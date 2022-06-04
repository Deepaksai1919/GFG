package Arrays;
/*
* Leader is the element which has no element larger than it to the right of it
* Eg:
* Inp: {7,10,4,10,6,5,2}
* Out: 10,6,5,2
* */
public class Leader {
    public static void main(String[] args){
        int[] arr = {7,10,4,10,6,5,2};
        findLeaders(arr);
    }

    private static void findLeaders(int[] arr){
        int leader = arr[arr.length - 1];
        System.out.println(leader);
        for(int i = arr.length - 2; i >= 0; i --){
            if(arr[i] > leader){
                leader = arr[i];
                System.out.println(leader);
            }
        }
    }
}
