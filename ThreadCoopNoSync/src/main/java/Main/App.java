package Main;

public class App 
{
    public static void main( String[] args )
    {
        String[] arr = { "_", "_", "_", "_", "_" };

        new Thread(new Runn(arr, "C", 0)).start();
        new Thread(new Runn(arr, "I", 1)).start();
        new Thread(new Runn(arr, "A", 2)).start();
        new Thread(new Runn(arr, "O", 3)).start();
        new Thread(new Runn(arr, "!", 4)).start();
    }
}
