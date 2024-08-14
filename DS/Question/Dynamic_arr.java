package Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dynamic_arr {
    static List<Integer> dynamicArray(int n,List<String> queries){
        List<List<Integer>> arr=new ArrayList<>(n);
            
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
            
        int lastAnswer=0;
        List<Integer> answer=new ArrayList<>(n);//answers to store the results of type 2 in queries
        
        for(String query:queries){
            String[] parts=query.split(" ");
            
            int type=Integer.parseInt(parts[0]); //Parse Query: Converts the split parts into integers.
            int x=Integer.parseInt(parts[1]);
            int y=Integer.parseInt(parts[2]);
            int idx=(x^lastAnswer)%n; //Calculate Index
            
            if(type==1){
                arr.get(idx).add(y);//appends y to the sequence at arr[idx].
            }
            else if(type==2){
                    List<Integer> seq=arr.get(idx);
                    lastAnswer=seq.get(y % seq.size());
                    answer.add(lastAnswer);
            }
        }
        return answer;
    }
    
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n=scan.nextInt();
            int q=scan.nextInt();
            
            scan.nextLine();
            
            List<String> queries=new ArrayList<>();
            for(int i=0;i<q;i++){
                queries.add(scan.nextLine());
            }
            
            List<Integer> result=dynamicArray(n,queries);
            for(int answer:result){
                System.out.println(answer);
            }
            scan.close();
        }
    }
}
