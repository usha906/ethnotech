import java.util.Set;
import java.util.TreeSet;
public class Examplecollection{

    public static void main(String[] args) {

        String[] students = {"101", "103", "102", "101"};

        Set<String> treeSet = new TreeSet<>();

        for (String roll : students) {
            treeSet.add(roll);
        }

        System.out.println("TreeSet: " + treeSet);
        System.out.println("Is Empty: " + treeSet.isEmpty());
        System.out.println("Contains 101: " + treeSet.contains("101"));
    }
}