package es.adrigala.ej1;

import java.util.Random;

/**
 * Created by juanxxiii on 23/01/2017.
 */
public class ControladorHilos {

    private int control = 1;

    public ControladorHilos() {

    }

    public synchronized void correr(String nombre) throws InterruptedException {
        while(!nombre.equals("Corredor " + control)){
            wait();
        }

        System.out.println("El hilo " + nombre + " ha empezado");
        try {
            Thread.sleep((long)new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El hilo " + nombre + " ha finalizado");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        control++;
        notifyAll();
    }
}
