package es.adrigala.ej1;

import java.util.Random;

/**
 * Created by Galaterro on 19/01/2017.
 */
public class HiloCorrer extends Thread {
    private int numero = 1;
    public HiloCorrer(int con) {
        this.numero = con;
    }

    @Override
    public synchronized void run() {
        System.out.println("El hilo Corredor " + numero + " ha empezado");
        try {
            Thread.sleep((long)new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El hilo Corredor " + numero + " ha finalizado");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    public void setNumero(int i){
        this.numero = i;
    }


}
