package es.adrigala.ej1;

/**
 * Created by juanxxiii on 19/01/2017.
 */
public class Relevos {
    public Relevos() {
        HiloCorrer[] hilos = new HiloCorrer[4];

        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new HiloCorrer();
            hilos[i].setName("Corredor " + (i+1));
            hilos[i].start();


        }
    }
}
