package es.adrigala.ej2;

/**
 * Created by Galaterro on 30/01/2017.
 */
public class ControlCaja {
    private int totalCaja;

    public ControlCaja(int totalCaja) {
        this.totalCaja = 0;
    }

    public synchronized void irACaja(int comprado){
        totalCaja += comprado;
    }

    public int getTotalCaja() {
        return totalCaja;
    }
}
