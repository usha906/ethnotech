import java.util.HashMap;

class Has {
    public static void main(String[] args) {
        HashMap<String, String> li = new HashMap<>();
        li.put("tree", "Neemtree");
        li.put("bird", "parrot");
        li.put("animal", "lion");
        li.put("fruit", "amla");
        li.put("vegetable", "tomato"); 
        System.out.println(li);
        System.out.println(li.get("tree"));
        li.remove("vegetable");
        System.out.println(li);
        System.out.println(li.containsKey("vegetable"));   
        System.out.println(li.containsValue("amla"));      
    }
}