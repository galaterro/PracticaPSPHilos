/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.adrigala.ej4;

/**
 *
 * @author bote
 */
public class ControlParking {
    private int n_plazas;
    private int plazas[];
    private int libres;
    
    public ControlParking(int n){
        this.n_plazas = n;
        plazas = new int[n];

        for(int i = 0; i < n_plazas ;i++){
           plazas[i] = 0;
        }
        libres = n_plazas;
    }

    synchronized public int entrada(int coche) throws InterruptedException {
        int plaza = 0;
        estadoParking();
        
        while (libres <= 0) {
            System.out.println("Coche " + coche + " esperando. El Parking esta lleno");
            wait();
        }
        while (plazas[plaza] != 0) {
            plaza++;
        }
        plazas[plaza] = coche;
        libres--;
        return plaza;
    }
    

    synchronized public void salida(int plaza) {
        plazas[plaza] = 0;
        libres++;
        notify();
    }
   
    public void estadoParking() {
        System.out.print("Parking: ");
        for (int i=0; i<n_plazas; i++) {
            if(plazas[i] == 0){
                System.out.println("Plaza nº " + (i + 1) + " vacia. ");
            }else if(plazas[i]>0){             
                System.out.print("Plaza nº" + (i + 1) + " coche " + plazas[i] + ". ");
            }
        }
        System.out.println("");
    }
}
