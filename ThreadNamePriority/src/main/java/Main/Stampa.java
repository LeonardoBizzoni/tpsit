package Main;

public class Stampa implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
    }
    
}
