/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.adrigala.ej3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CajaDos implements Runnable {

    private SuperMarketDos supermarket;
    private int numero;
    ClienteDos clienteDos = null;

    public CajaDos(SuperMarketDos supermarket, int numero) {
        this.supermarket = supermarket;
        this.numero = numero;
    }

    public void setThread(Thread thread) {
        Thread thread1 = thread;
    }

    @Override
    public void run() {
        
        
        do {
            clienteDos = supermarket.siguienteCliente();

            if (clienteDos != null) {
                try {
                    System.out.println("la caja: " + this.numero + " tiene el cliente: " + (clienteDos.getNumero() + 1));
                    int estancia = ramdomTiempo();
                    Thread.sleep(estancia);
                    clienteDos.setTiempo(estancia);
                    System.out.println("la caja: " + this.numero + " tiene el cliente: " + (clienteDos.getNumero() + 1));

                } catch (InterruptedException ex) {
                    Logger.getLogger(SuperMarketDos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } while (clienteDos != null);
        System.out.println("La caja: " + this.numero + " ha sido cerrada");
    }

    public int ramdomTiempo() {

        int numeroAleatorio = (int) (Math.random() * 3000);
        return numeroAleatorio;
    }
}
