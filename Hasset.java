import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Hasset {
    public static void main(String[] args) {
        System.out.println("Set Program - Hashset,Treeset,LinkedList");
        Set<Integer> Rollno = new HashSet<>();
        Rollno.add(1);
        Rollno.add(2);
        Rollno.add(3);
        System.out.println("This is for Set");
        System.err.println("Hashset");
        HashSet<Integer> nums=new HashSet<>();
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        System.out.println("hashset is for maintaining ordered list");
        System.out.println("find the number"+nums.contains(6));
        System.out.println("remove the number"+nums.remove(7));
        System.out.println("elements of hashset"+nums);
        System.out.println("Linked List");
        LinkedList<Integer>num=new LinkedList<>();
        num.add(9);
        num.add(10);
        num.add(11);
        num.add(12);
       System.out.println("size of the student numbers: "+num.size());
       System.out.println("to check it is empty "+num.isEmpty());
       System.out.println("check for contains "+num.contains(1));
       System.out.println("tree set");
       TreeSet <Integer> n=new TreeSet<>();
       for(Integer i:num){
        n.add(i);
       }
       System.out.println("checking contains"+n.contains(10));
       System.out.println("checking is empty"+n.isEmpty());
    }
}