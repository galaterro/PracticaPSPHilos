package es.adrigala.ej2;

import java.util.Random;

/**
 * Created by Galaterro on 26/01/2017.
 */
public class Cliente extends Thread {
    private ControlCaja control;

    public Cliente(ControlCaja controlCajas) {
        this.control = controlCajas;
    }

    @Override
    public void run() {
        try {
            System.out.println("empieza");
            Thread.sleep((long)new Random().nextInt(5000));
          /*  controlCajas[new Random().nextInt(controlCajas.length)].irACaja(new Random().nextInt(15));*/
            System.out.println("Acaba");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
