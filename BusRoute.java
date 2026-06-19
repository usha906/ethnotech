class BusStop {
    String stopName;
    BusStop next;

    BusStop(String stopName) {
        this.stopName = stopName;
        this.next = null;
    }
}

public class BusRoute {
    BusStop head;

    public void addition(String stopName) {
        BusStop newStop = new BusStop(stopName);

        if (head == null) {
            head = newStop;
        } else {
            BusStop temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStop;
        }
    }

    public void display() {
        BusStop temp = head;
        while (temp != null) {
            System.out.print(temp.stopName + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        BusRoute route = new BusRoute();

        route.addition("MITS");
        route.addition("Railway Station");
        route.addition("Bus Stand");
        route.addition("Market");

        route.display();
    }
}