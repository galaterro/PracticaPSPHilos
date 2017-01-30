package es.adrigala.ej1;

import java.util.Random;

/**
 * Created by juanxxiii on 19/01/2017.
 */
public class HiloCorrer extends Thread {
    private ControladorHilos con;

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

