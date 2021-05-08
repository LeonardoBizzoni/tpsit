package Main;

import java.util.concurrent.ThreadLocalRandom;

public class Runn implements Runnable {
    private String[] arr;
    private String letter;
    private int i;

    public Runn(String[] arr, String letter, int i) {
        this.arr = arr;
        this.letter = letter;
        this.i = i;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
            arr[i] = letter;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
