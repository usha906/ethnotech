
class messageSender extends Thread{
   
    public messageSender(String name)
    {
        super(name);
    }
     @Override
    public void run()
    {
        try
        {
            for(int i=0;i<2;i++)
            {
                System.out.println(getName()+" Sending message");    
                Thread.sleep(1000);      
            }
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
            System.out.println("Thread Interrrupted"+e);
        }
        System.out.println();

        
    }
}

public class Network {
    public static void main(String[] args) {
        messageSender sender1=new messageSender("usha");
        messageSender sender2=new messageSender("sruthi");
        sender1.start();
        sender2.start();
    }
    
}
