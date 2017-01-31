/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.adrigala.ej3;

import java.util.ArrayList;
import java.util.Scanner;


public class SuperMarketDos {

    private ArrayList<ClienteDos> clientesCola;
    private ArrayList<ClienteDos> clientesListos;
    private ArrayList<CajaDos> cajaDoss;

    public SuperMarketDos() {
        cajaDoss = new ArrayList();
        clientesListos = new ArrayList();
        clientesCola = new ArrayList();
    }

    public void iniciar() {
        SuperMarketDos supermarket = new SuperMarketDos();
        System.out.println("numero de clientes: ");
        Scanner clientes = new Scanner(System.in);
        int numeroCliente = clientes.nextInt();

        System.out.println("numero de caja: ");
        Scanner cajas = new Scanner(System.in);
        int numeroCajas = cajas.nextInt();

        for (int i = 0; i < numeroCliente; i++) {
            ClienteDos clienteDos = new ClienteDos(i);
            clienteDos.setNumero(i);
            supermarket.nuevoCliente(clienteDos);
        }

        for (int x = 0; x < numeroCajas; x++) {
            CajaDos cajaDos = new CajaDos(supermarket, x + 1);
            supermarket.nuevaCaja(cajaDos);

        }
    }

    public synchronized ClienteDos siguienteCliente() {
        ClienteDos clienteDos = null;
        if (this.clientesCola.size() > 0) {
            clienteDos = this.clientesCola.remove(0);
            clientesListos.add(clienteDos);
        }
        return clienteDos;
    }

    public void nuevoCliente(ClienteDos c) {
        this.clientesCola.add(c);
    }

    public void nuevaCaja(CajaDos cajaDos) {
        this.cajaDoss.add(cajaDos);
        Thread hiloCaja = new Thread(cajaDos);
        cajaDos.setThread(hiloCaja);
        hiloCaja.start();

    }

}
