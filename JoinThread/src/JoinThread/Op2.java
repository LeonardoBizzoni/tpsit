package JoinThread;

public class Op2 implements Runnable {
    private Buffer buf;

    private int b;

    public Op2(Buffer buf) {
        this.buf = buf;
        b = buf.getB();
    }

    @Override
    public void run() {
        buf.setB(5 * b - 7);

        System.out.println("Ho calcolato b: " + buf.getB());
    }
}
