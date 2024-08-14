package Searching;

public class Linear{
    public static int lin_search(int[]arr,int target){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1; //-1 if target is not found
    }
    public static void main(String[] args) {
        int[] number={3,5,2,4,9};
        int target=4;

        int result=lin_search(number, target);

        if(result!=-1){
            System.out.println("Found at index "+result);
        }
        else{
            System.out.println("not found in the list");
        }

    }

}
    