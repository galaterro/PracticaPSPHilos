package es.adrigala.ej1;

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
}
