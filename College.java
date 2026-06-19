import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
class College {
        public static void main(String[] args) {
        Queue<String> a = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of registrations: ");
        int n = sc.nextInt();
        sc.nextLine();   
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String e = sc.nextLine();
            if (!a.contains(e)) {
                a.offer(e);
            }
        }
        System.out.println("\nUnique Students are:");
        for (String student : a) {
            System.out.println(student);
        }  
    }
}