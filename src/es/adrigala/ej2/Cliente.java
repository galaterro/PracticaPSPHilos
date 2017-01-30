package es.adrigala.ej2;

import java.util.Random;

/**
 * Created by Galaterro on 26/01/2017.
 */
public class Cliente extends Thread {
    private ControlCaja control;
    private int id;

    public Cliente(ControlCaja controlCajas, int id) {
        this.control = controlCajas;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.println(Thread.currentThread().getName()  + " intenta entrar en una caja");
            int plaza = control.entrada(id);
            System.out.println(Thread.currentThread().getName()  + " está en la caja " + (plaza + 1));
            control.estadoCaja();
            Thread.sleep(new Random().nextInt(2000));
            control.salida(plaza);
            System.out.println(Thread.currentThread().getName() +" saliendo");
            control.estadoCaja();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
