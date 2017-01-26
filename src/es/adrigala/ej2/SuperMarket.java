package es.adrigala.ej2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Galaterro on 26/01/2017.
 */
public class SuperMarket {
    private int cajas;
    private int clientes;
    private Thread[] hilos;
    public SuperMarket() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el número de cajas disponibles:");
        try {
            cajas = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Introduzca el número de clientes:");
        try {
            clientes = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        hilos = new Cliente[clientes];



    }
}
