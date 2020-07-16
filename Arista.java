package trabajoa.p_punto4;

public class Arista {

    private Nodo arista1;
    private Nodo arista2;

    public Arista(Nodo arista1, Nodo arista2) {
        this.arista1 = arista1;
        this.arista2 = arista2;
    }

    public Nodo getArista1() {
        return arista1;
    }

    public void setArista1(Nodo arista1) {
        this.arista1 = arista1;
    }

    public Nodo getArista2() {
        return arista2;
    }

    public void setArista2(Nodo arista2) {
        this.arista2 = arista2;
    }

}
