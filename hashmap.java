package Hashset_Map;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {

        //country(key),population(value)

        HashMap<String,Integer> map=new HashMap<>();

        //Insert
        map.put("India",120);
        map.put("US", 134);
        map.put("China", 123);
        System.out.println(map);

        //Update
        map.put("China", 133);
        System.out.println(map);

        //search
        if(map.containsKey("China")){
            System.out.println("china is present");
        }
        if(map.containsKey("Indochina")){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
        // valueFinder
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));
        
        //Iteration
        int arr[]={12,15,19};
        for(int i=0; i<3;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();

        for (Map.Entry<String, Integer> en : map.entrySet()) {
            String key = en.getKey();
            Integer val = en.getValue(); //datatype -> object

            System.out.println(key);
            System.out.println(val);   
        }
        //Deletion

        map.remove("China");
        System.out.println(map);
    }
}
