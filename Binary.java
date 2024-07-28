package Searching;

public class Binary{
    public static int binary(int[] arr,int target){

        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){ //target is smaller, ignore the right half
                left=mid+1;
            }
            if(arr[mid]>target){
                right=mid-1;
            }
        }

        return -1;
    }
    
    
    public static void main(String[] args) {
        int[] number={2,3,4,5,9};
        int target=5;
        int result=binary(number, target);

        if(result!=-1){
            System.out.println("found at idx "+result);
        }
        else{
            System.out.println("not found");
        }        
    }
}
