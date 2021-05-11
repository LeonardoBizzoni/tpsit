package Main;

public class Leggi1 implements Runnable {
    private int count = 0;
    private boolean inEsecuzione = true;

    @Override
    public void run() {
        while (inEsecuzione)
            count++;

        System.out.println("T1: ho letto " + count + " righe");
    }
    
    public void stop() {
        inEsecuzione =  false;
        System.out.println("false");

    }
}
