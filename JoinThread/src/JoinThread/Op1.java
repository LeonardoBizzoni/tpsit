package JoinThread;

public class Op1 implements Runnable {
    private Buffer buf;

    private int a;

    public Op1(Buffer buf) {
        this.buf = buf;
        this.a = buf.getA();
    }

    @Override
    public void run() {
        buf.setA(3 + 2 * a);

        System.out.println("Ho calcolato a: " + buf.getA());
    }
}
