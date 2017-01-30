/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.adrigala.ej4;

import java.util.Random;

/**
 *
 * @author Galaterro
 */
public class Coches extends Thread{
    
    private int id;
    private ControlParking control;
    private boolean aparcado = false;
    
    Coches (int id, ControlParking control) {
        this.id = id;
        this.control = control;
    }
    
    public void run() {
        try {
            
                Thread.sleep(new Random().nextInt(5000));
                System.out.println(Thread.currentThread().getName()  + " intenta entrar en parking");
                int plaza = control.entrada(id);
                System.out.println(Thread.currentThread().getName()  + " aparcado en la plaza número " + (plaza + 1));
                control.estadoParking();
                Thread.sleep(new Random().nextInt(2000));
                control.salida(plaza);
                System.out.println(Thread.currentThread().getName() +" saliendo");
                control.estadoParking();
                
            

        } catch (InterruptedException e) {
            System.out.println("Error con los hilos de coche");
        }
    }
}
