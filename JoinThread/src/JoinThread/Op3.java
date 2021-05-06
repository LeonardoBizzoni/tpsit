package JoinThread;

public class Op3 implements Runnable {
    private Buffer buf;

    private int c;

    public Op3(Buffer buf) {
        this.buf = buf;
        c = buf.getC();
    }

    @Override
    public void run() {
        buf.setC(8 - 3 * c);
        System.out.println("Ho calcolato c: " + buf.getC());
    }
}
