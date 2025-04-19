import java.util.*;
public class matrix {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n=scan.nextInt();
            int m=scan.nextInt();
            
            int[][] mat=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mat[i][j]=scan.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    
}
