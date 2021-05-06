package JoinThread;

public class Main {

    public static void main(String[] args) {
        Buffer buf = new Buffer(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));

        Thread t0 = new Thread(new Op1(buf));
        Thread t1 = new Thread(new Op2(buf));
        Thread t2 = new Thread(new Op3(buf));
        Thread t3;
        Thread t4;

        t0.start();
        t1.start();
        t2.start();

        try {
            t0.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3 = new Thread(new Op4(buf));
        t3.start();

        try {
            t0.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t4 = new Thread(new Op5(buf));
        t4.start();
    }
}

class Buffer {
    private int a = 0, b = 0, c = 0, t = 0, k = 0;

    public Buffer(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

        System.out.println("\tDeve calcolare (3+2a)*(5b-7)+(8-3c)");
        System.out.printf("\tI parametri valgono:\na: %d\tb: %d\tc: %d\n", a, b, c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getT() {
        return t;
    }

    public int getK() {
        return k;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void setK(int k) {
        this.k = k;
    }
}