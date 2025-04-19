package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class traverse_ll{

    public static LinkedList<Integer> createLL(int n, Scanner scan){
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            int value=scan.nextInt();
            list.add(value);
        }
        return list;
    }
    public static void printLL(LinkedList<Integer> list){
        for(int value:list){
            System.out.print(value+",");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        LinkedList<Integer> list=createLL(n, scan);
        System.out.println("elements of linkedlist be");
        printLL(list);
    }
}