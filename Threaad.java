
class Mythread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is started");
    }
}

public class Threaad {

    public static void main(String[] args) {

        Mythread t1 = new Mythread();
        t1.start();

    }
}