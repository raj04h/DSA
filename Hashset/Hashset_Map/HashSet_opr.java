package Hashset_Map;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_opr {

    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        //Insert

        set.add(1); //list.add()--for List DS
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(51);
        set.add(13);
        set.add(14);
        set.add(9);

        // searching

        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(7)){
            System.out.println("set does not contains 7");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contains 1-- we delete it");
        }
        //size
        System.out.println("size= "+ set.size());
        System.out.println(set);
    
        //Iterator
        @SuppressWarnings("rawtypes")
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ ", ");

        }
    }    
}
