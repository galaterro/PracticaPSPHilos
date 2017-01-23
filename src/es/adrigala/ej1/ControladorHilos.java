package es.adrigala.ej1;

import java.util.Random;

/**
 * Created by juanxxiii on 23/01/2017.
 */
public class ControladorHilos {
    private boolean empezado;

    public ControladorHilos() {
        this.empezado = false;
    }

    public boolean isEmpezado() {
        return empezado;
    }

    public void empezar() {
        this.empezado = true;
    }

    public void acabar(){
        this.empezado = false;
    }

    public synchronized void correr(String nombre) throws InterruptedException {
        while(this.isEmpezado()){
            wait();
        }
        this.empezar();
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
        this.acabar();
        notifyAll();
    }
}
