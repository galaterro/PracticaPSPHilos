package es.adrigala.ej2;

import java.util.Random;

/**
 * Created by Galaterro on 26/01/2017.
 */
class Cliente extends Thread {
    private final ControlCaja control;
    private final int id;

    public Cliente(ControlCaja controlCajas, int id) {
        this.control = controlCajas;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.println(Thread.currentThread().getName()  + " intenta entrar en una caja");
            int caja = control.entrada(id);
            System.out.println(Thread.currentThread().getName()  + " está en la caja " + (caja + 1));
            control.estadoCaja();
            Thread.sleep(new Random().nextInt(2000));
            control.salida(caja);
            System.out.println(Thread.currentThread().getName() +" saliendo");
            control.estadoCaja();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
