package trabajoa.p_punto4;

import java.util.ArrayList;

public class GrafoLista {

    private int N;
    private ArrayList<Nodo> ver;
    private ArrayList<Arista> aris;

    public GrafoLista(int N) {
        this.N = N;
        this.ver = new ArrayList<>();
        this.aris = new ArrayList<>();
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public ArrayList<Nodo> getVer() {
        return ver;
    }

    public void setVer(ArrayList<Nodo> ver) {
        this.ver = ver;
    }

    public ArrayList<Arista> getAris() {
        return aris;
    }

    public void setAris(ArrayList<Arista> aris) {
        this.aris = aris;
    }

    // Metodos 
    // se insertan todos los nodos
    public void insertarNodo(int n) {
        N++;
        Nodo nuevo = new Nodo(n);
        ver.add(nuevo);
        System.out.println("Nodo " + n + " insertado...");
    }

    public boolean insertarArista(int n1, int n2) {

        boolean inserto = false;
        Nodo nodo1 = null;
        Nodo nodo2 = null;
        for (Nodo nodo : ver) {
            if (n1 == nodo.getDato()) {
                nodo1 = nodo;
            }
            if (n2 == nodo.getDato()) {
                nodo2 = nodo;
            }
        }
        if (nodo1 != null && nodo1 != null) {
            nodo1.setDato(nodo1.getGrado() + 1);
            nodo2.setDato(nodo2.getGrado() + 1);
            nodo1.getNodosAdyasentes().add(nodo2);
            nodo2.getNodosAdyasentes().add(nodo1);
            Arista arista = new Arista(nodo1, nodo2);
            aris.add(arista);
            inserto = true;
            System.out.println("Arista " + n1 + "," + n2 + " insertada...");
        }
        return inserto;
    }

    public ArrayList<Nodo> DFSLista() {
        ArrayList<Nodo> lista = new ArrayList<>();

        return lista;
    }

    public ArrayList<Nodo> DFSListaAux(ArrayList<Nodo> lista) {
        
        

        return lista;
    }
}
