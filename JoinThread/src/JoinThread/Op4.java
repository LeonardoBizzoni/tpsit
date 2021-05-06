package JoinThread;

public class Op4 implements Runnable {
    private Buffer buf;

    private int y;
    private int z;

    public Op4(Buffer buf) {
        this.buf = buf;

        y = buf.getA();
        z = buf.getB();
    }

    @Override
    public void run() {
        buf.setT(y * z);

        System.out.println("Ho calcolato t: " + buf.getT());
    }
}
