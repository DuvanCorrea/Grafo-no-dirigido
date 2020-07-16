package trabajoa.p_punto4;

import java.util.ArrayList;

public class Nodo {

    private int dato, grado;
    private ArrayList<Nodo> nodosAdyasentes;
    boolean visitado;

    public Nodo(int dato) {
        this.grado = 0;
        this.dato = dato;
        this.nodosAdyasentes = new ArrayList<>();
        this.visitado = false;
    }

    public int getDato() {
        return dato;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public ArrayList<Nodo> getNodosAdyasentes() {
        return nodosAdyasentes;
    }

    public void setNodosAdyasentes(ArrayList<Nodo> nodosAdyasentes) {
        this.nodosAdyasentes = nodosAdyasentes;
    }

}
