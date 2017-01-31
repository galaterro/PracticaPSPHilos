package es.adrigala.ej1;

/**
 * Created by juanxxiii on 19/01/2017.
 */
class HiloCorrer extends Thread {
    private final ControladorHilos con;

    public HiloCorrer(ControladorHilos con) {
        this.con = con;
    }

    @Override
    public void run() {
        try {
            con.correr(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

