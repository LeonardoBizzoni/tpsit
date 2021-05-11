package Main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Leggi l1 = new Leggi();
        Leggi1 l2 = new Leggi1();
        
        Thread t0 = new Thread(l1);
        Thread t1 = new Thread(l2);
        
        t0.start();
        t1.start();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        
        l1.stop();
        l2.stop();
    }
}
