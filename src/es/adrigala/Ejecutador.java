package es.adrigala;

import es.adrigala.ej1.Relevos;

import java.util.concurrent.Semaphore;

/**
 * Created by juanxxiii on 19/01/2017.
 */
public class Ejecutador {
    public static void main(String[] args) {
        try {
            System.out.println("Ejecutando ejercicio 1");
            System.out.println("***********");
            Thread.sleep(1500);
            Relevos ej1 = new Relevos();
            System.out.println("***********");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
