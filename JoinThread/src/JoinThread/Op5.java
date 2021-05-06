package JoinThread;

public class Op5 implements Runnable {
    private Buffer buf;

    private int x;
    private int t;

    public Op5(Buffer buf) {
        this.buf = buf;

        x = buf.getC();
        t = buf.getT();
    }

    @Override
    public void run() {
        buf.setK(x + t);

        System.out.println("Ho calcolato il risultato finale k: " + buf.getK());
    }
}
