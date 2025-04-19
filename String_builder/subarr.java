// You are using Java
import java.util.*;
public class subarr{
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n=scan.nextInt();
            int[] arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            int k=scan.nextInt();
            
            HashMap<Integer,Integer> div=new HashMap<>();
            div.put(0,1);
            
            int sum=0;
            int count=0;
            
            for(int i=0;i<n;i++){
                sum+=arr[i];
                int reminder=sum%k;
                
                if (reminder<0){
                    reminder+=k; // adjust negative reminder
                }
                if(div.containsKey(reminder)){
                    count+=div.get(reminder);
                }
                div.put(reminder,div.getOrDefault(reminder,0)+1);
            }
            System.out.println(count);
        }
    }
}
