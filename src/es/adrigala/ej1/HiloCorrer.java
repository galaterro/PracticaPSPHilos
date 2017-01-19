package es.adrigala.ej1;

import java.util.Random;

/**
 * Created by juanxxiii on 19/01/2017.
 */
public class HiloCorrer extends Thread {
    @Override
    public void run() {
      this.correr();
    }

    public synchronized void correr(){
        System.out.println("El hilo " + Thread.currentThread().getName() + " ha empezado");
        try {
            Thread.sleep((long)new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El hilo " + Thread.currentThread().getName() + " ha finalizado");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
