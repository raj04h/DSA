package Array;

import java.util.Scanner;

public class matrix_traverse {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int r=scan.nextInt();//row
            int c=scan.nextInt();//column
            scan.nextLine();

            char[][] matrix=new char[r][c];
            for (int i = 0; i <r; i++) {
                String rowelement=scan.nextLine();
                matrix[i]=rowelement.toCharArray();
            }
            System.out.println("The matrix is:");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Maxborder be ");
            int maxborder=0;
            for(int i=0;i<r;i++){
                int currborder=0;
                for(int j=0;j<c;j++){
                    if(matrix[i][j]=='#'){
                        currborder++;
                        maxborder=Math.max(maxborder, currborder);
                    }
                    else{
                        currborder=0;
                    }
                }
            }
            for(int j=0;j<c;j++){
                int currborder=0;
                for (int i = 0; i < r; i++) {
                    if(matrix[i][j]=='#'){
                        currborder++;
                        maxborder = Math.max(maxborder, currborder);
                    }
                    else{
                        currborder=0;
                    }
                }
            }
            System.out.println(maxborder);
        }
        }

    }
