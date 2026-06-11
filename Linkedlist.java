import java.util.LinkedList;
import java.util.List;
class Linkedlist
{
    public static void main(String[] args)
    {
         LinkedList<String> li=new LinkedList<>();
         li.add("usha");
         li.add("sruthi");
         li.add("sravani");
         li.add("sri");
         li.add("varalakshmi");
         li.add("pravalika");
         li.add("vyshnavi");
         li.add("rani");
         System.out.println(li);
         li.remove("rani");
         System.out.println(li);
    
    }
}