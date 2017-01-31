package es.adrigala.ej2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Galaterro on 26/01/2017.
 */
public class SuperMarket {
    private int totalCajas;
    private int clientes;

    public SuperMarket() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el número de Cajas disponibles:");
        try {
            totalCajas = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Introduzca el número de clientes:");
        try {
            clientes = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControlCaja controlCaja = new ControlCaja(totalCajas);
        Thread[] hilos = new Thread[clientes];
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Cliente(controlCaja, (i + 1));
            hilos[i].setName("Cliente " + (i+1));
            hilos[i].start();
        }
    }
}
