package Main;

public class App {
    public static void main(String[] args) {
        String[] arr = { "_", "_", "_", "_", "_" };

        Thread t0 = new Thread(new Runn(arr, "C", 0));
        Thread t1 = new Thread(new Runn(arr, "I", 1));
        Thread t2 = new Thread(new Runn(arr, "A", 2));
        Thread t3 = new Thread(new Runn(arr, "O", 3));
        Thread t4 = new Thread(new Runn(arr, "!", 4));

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        try {
            t0.join();
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
