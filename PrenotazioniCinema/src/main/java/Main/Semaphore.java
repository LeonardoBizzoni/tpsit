package Main;

public class Semaphore {
    public synchronized void lock(int sala, int postiReq) {
        while (App.postiSala[sala] - postiReq < 0) {
            try {
                System.out.println("\t\tIn attesa di " + postiReq +" posti liberi in sala " + sala);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        App.postiSala[sala] -= postiReq;

        System.out.println(postiReq + " posti occupati in sala " + sala);
        System.out.println("Posti liberi in sala" + sala + ": " + App.postiSala[sala]);
    }

    public synchronized void unlock(int sala, int postiReq) {
        App.postiSala[sala] += postiReq;
        this.notifyAll();

        System.out.println("\t" + postiReq + " posti liberati in sala " + sala);
        System.out.println("\tPosti liberi in sala" + sala + ": " + App.postiSala[sala]);
    }
}
