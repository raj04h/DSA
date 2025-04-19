package String_arr;

import java.util.Scanner;

public class commonString {
    static void commonStr(int n,String[] A,String[] B){
        
        for(int i=0;i<n;i++){
            if(hasCommon(A[i],B[i])){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    static  boolean  hasCommon(String a,String b){
        boolean[] freq=new boolean[26];
        for(char c:a.toCharArray()){
            freq[c-'a']=true;
        }
        for (char c : b.toCharArray()) {
            if (freq[c - 'a']) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        scan.nextLine();
        String[] A=new String[n];
        for(int i=0;i<n;i++){
            A[i]=scan.next();
        }
        String[] B=new String[n];
        for(int i=0;i<n;i++){
            B[i]=scan.next();
        }
        commonStr(n, A, B);
        scan.close();
    }
}
