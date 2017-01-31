package es.adrigala.ej2;

import java.util.Random;

/**
 * Created by Galaterro on 30/01/2017.
 */
class ControlCaja {
    private final int totalCaja;
    private final int[] cajas;
    private int libres;
    private int dinero;

    public ControlCaja(int n){
        this.totalCaja = n;
        cajas = new int[n];

        for(int i = 0; i < totalCaja ;i++){
            cajas[i] = 0;
        }
        libres = totalCaja;
    }

    synchronized public int entrada(int cliente) throws InterruptedException {
        int plaza = 0;
        estadoCaja();

        while (libres <= 0) {
            System.out.println("\tCliente " + cliente + " esperando. Las cajas están llenas");
            wait();
        }
        while (cajas[plaza] != 0) {
            plaza++;
        }
        cajas[plaza] = cliente;
        libres--;
        return plaza;
    }


    synchronized public void salida(int plaza) {
        pagar(new Random().nextInt(15));
        cajas[plaza] = 0;
        libres++;
        notify();
    }

    private void pagar(int pagado){
        dinero += pagado;
    }

    public void estadoCaja() {
        System.out.print("CajaDos: \n");
        for (int i=0; i<totalCaja; i++) {
            if(cajas[i] == 0){
                System.out.println("Caja nº " + (i + 1) + " vacia. ");
            }else if(cajas[i]>0){
                System.out.print("Caja nº" + (i + 1) + " cliente " + cajas[i] + ". \n");
            }
        }
        System.out.println("Total Ganancias: " + dinero);
    }
}
