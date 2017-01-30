package es.adrigala.ej2;

/**
 * Created by Galaterro on 30/01/2017.
 */
public class ControlCaja {
    private int totalCaja;
    private int cajas[];
    private int libres;

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
        cajas[plaza] = 0;
        libres++;
        notify();
    }

    public void estadoCaja() {
        System.out.print("Caja: \n");
        for (int i=0; i<totalCaja; i++) {
            if(cajas[i] == 0){
                System.out.println("Caja nº " + (i + 1) + " vacia. ");
            }else if(cajas[i]>0){
                System.out.print("Caja nº" + (i + 1) + " cliente " + cajas[i] + ". \n");
            }
        }
        System.out.println("");
    }
}
