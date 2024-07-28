package Hash_ques;
import java.util.HashMap;

public class Iteration_ticket {
    public static String getStart(HashMap<String,String> ticket){
        HashMap<String,String> Map=new HashMap<>();  

        for(String Key:ticket.keySet()){
            Map.put(ticket.get(Key), Key);
        }
        for(String Key:ticket.keySet()){
            if(! Map.containsKey(Key)){
               return Key;
            }
        }
        return  null;
    }    
    public static void main(String[] args){
        HashMap<String,String> ticket=new HashMap<>(); 

        ticket.put("Chennai", "Bangaluru");
        ticket.put("Mumbai","Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");

        String start=getStart(ticket);

        while(ticket.containsKey(start)){
            System.out.print(start+ "->");
            start=ticket.get(start);
        }
        System.out.println(start);
    }

}
