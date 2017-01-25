package es.adrigala;

import es.adrigala.ej1.Relevos;

import java.util.concurrent.Semaphore;

/**
 * Created by juanxxiii on 19/01/2017.
 */
public class Ejecutador {
    public static void main(String[] args) {
        try {
            Relevos ej1 = new Relevos();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
