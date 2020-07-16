package trabajoa.p_punto4;

public class Vertise {

    int dato;
    boolean visitado;

    public Vertise(int dato, boolean visitado) {
        this.dato = dato;
        this.visitado = visitado;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

}
