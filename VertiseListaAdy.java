package trabajoa.p_punto4;

import java.util.LinkedList;

public class VertiseListaAdy {

    LinkedList<VertiseListaAdy> aristas;
    int dato;
    boolean visitado;

    public VertiseListaAdy(LinkedList<VertiseListaAdy> aristas, int nombre, boolean visitado) {
        this.dato = nombre;
        this.visitado = false;
        this.aristas = new LinkedList<>();
    }

    public LinkedList<VertiseListaAdy> getAristas() {
        return aristas;
    }

    public void setAristas(LinkedList<VertiseListaAdy> aristas) {
        this.aristas = aristas;
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
