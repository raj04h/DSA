package BitManup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Xor{
    
    public static int xoroperation(List<Integer> a){
            int unique=0;
            for(int num:a){
                unique^=num;
            }
            return unique;
    }
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n=scan.nextInt();

            List<Integer> a=new ArrayList<>();

            for(int i=0;i<n;i++){
                a.add(scan.nextInt());
            }
            int result=xoroperation(a);
            System.out.println(result);
        }
    }
}