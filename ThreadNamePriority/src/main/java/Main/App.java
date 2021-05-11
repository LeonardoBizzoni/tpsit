package Main;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        Thread t0 = new Thread(new Stampa());
        t0.setName("Thread1");
        t0.setPriority(10);

        Thread t1 = new Thread(new Stampa());
        t1.setName("Thread2");
        t1.setPriority(9);
        
        t0.start();
        t1.start();
    }
}
