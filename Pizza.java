

public class Pizza {
    Pizza() {
        System.out.println("Pizza is ready");
    }
    public static void main(String[] args) {
        try {
            Pizza p = new Pizza(); 
            System.out.println("Pizza is  ready");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}