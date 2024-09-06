package Question;

import java.util.Scanner;

public class reverse_arr{

    public static void reversedArr(int[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n=scan.nextInt();

            int[] Arr=new int[n];
            for (int i = 0; i< n; i++) {
                Arr[i]=scan.nextInt();
            }
            reversedArr(Arr);
            for (int i = 0; i < n; i++) {
                System.out.print(Arr[i]+" ");
            }
        }    
    }
        
}