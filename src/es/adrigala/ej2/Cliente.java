package es.adrigala.ej2;

import java.util.Random;

/**
 * Created by Galaterro on 26/01/2017.
 */
public class Cliente extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("empieza");
            wait((long) (Math.random()*5000+1));
            System.out.println("Acaba");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
