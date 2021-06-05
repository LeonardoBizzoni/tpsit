package Main;

class CassaFisica implements Runnable {
    Semaphore s;
    int nSala, nPosti, tempo;

    public CassaFisica(Semaphore s, int nSala, int nPosti, int tempo) {
        this.s = s;
        this.nSala = nSala;
        this.nPosti = nPosti;
        this.tempo = tempo;
    }
    
    @Override
    public void run() {
        s.lock(nSala, nPosti);

        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        s.unlock(nSala, nPosti);
    }
}
