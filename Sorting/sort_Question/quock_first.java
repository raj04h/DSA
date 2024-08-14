package sort_Question;

import java.util.ArrayList;
import java.util.List;

public class quock_first {
    static List<Integer> quick(List<Integer> arr){
        int pivot=arr.get(0);
        
        List<Integer> left=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        for(int num:arr){
            if(num<pivot){
                left.add(num);
            }
            else if(num==pivot){
                equal.add(num);
            }
            else{
                right.add(num);
            }
        }
        List<Integer> result=new ArrayList<>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);

        return result;
    }
    
    public static void main(String[] args) {
         List<Integer> arr=List.of(4,5,3,7,2);
         List<Integer> sortArr=quick(arr);
         
         System.out.print("Quick sort= ");
         for(int num:sortArr){
            System.out.print(+num+" ");  // Output should be: 3 2 4 5 7
         }
    }
}
