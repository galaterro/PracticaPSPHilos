package es.adrigala.ej1;


/**
 * Created by juanxxiii on 19/01/2017.
 */
public class Relevos {
    public Relevos() throws InterruptedException {
        Thread hilos;
        for (int i = 0; i < 4; i++) {
            hilos = new HiloCorrer(i + 1);
            hilos.setName("Corredor " + (i+1));
            hilos.run();

        }
    }
}
