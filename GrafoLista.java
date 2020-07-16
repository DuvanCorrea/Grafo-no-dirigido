package trabajoa.p_punto4;

import java.util.LinkedList;
import java.util.Queue;

public class GrafoLista {

    private LinkedList<Arista> aristas; 
    private LinkedList<VertiseListaAdy> lista_ady;  

    public GrafoLista() {
        this.aristas = new LinkedList<>();
        this.lista_ady = new LinkedList<>();
    }



    public void ingresarVertice(int nombre) {
        Vertise vertise = new Vertise(nombre, false);
        VertiseListaAdy vertiseListaAdy = new VertiseListaAdy(null, nombre, false);
        lista_ady.add(vertiseListaAdy);
        System.out.println("Vertice " + nombre + " insertado...");

    }

    public Arista ingresarAristayRetornaArsita(int ver1, int ver2) {

        boolean ingreso = false;

        int v1 = ver1;
        int v2 = ver2;

        // ingreso de arista a lista de ady
        //  lista_ady.get(v1).getAristas().add(lista_ady.get(v2)); // forma antigua
        VertiseListaAdy vertice1 = null;
        VertiseListaAdy vertice2 = null;

        for (int i = 0; i < lista_ady.size(); i++) {
            if (lista_ady.get(i).getDato() == v1) {
                vertice1 = lista_ady.get(i);
            }
        }
        for (int i = 0; i < lista_ady.size(); i++) {
            if (lista_ady.get(i).getDato() == v2) {
                vertice2 = lista_ady.get(i);
            }
        }

        vertice1.getAristas().add(vertice2);
        vertice2.getAristas().add(vertice1);

        if (vertice1 != null && vertice2 != null) {
            System.out.println("Arista " + v1 + "," + v2 + " ingresada...");
        }

        // fin ingreso de arista a lista de ady
        // normal
        Vertise verti1 = null;
        Vertise verti2 = null;

        Arista arista = new Arista(verti1, verti2);
        aristas.add(arista);

        return arista;

    }

    public Arista retornarArista(int v1, int v2) {

        for (int i = 0; i < aristas.size(); i++) {

            if ((aristas.get(i).getV1().getDato() == v1
                    && aristas.get(i).getV2().getDato() == v2)
                    || (aristas.get(i).getV2().getDato() == v1
                    && aristas.get(i).getV1().getDato() == v2)) {

                Arista arista = aristas.get(i);
                return arista;
            }
        }
        return null;
    }

    public LinkedList<VertiseListaAdy> recorridoBFS() {
        LinkedList<VertiseListaAdy> recorrido = new LinkedList<>();
        Queue<VertiseListaAdy> cola = new LinkedList<>();

        recorrido.add(lista_ady.get(0));

        for (int i = 0; i < lista_ady.size(); i++) {

            if (lista_ady.get(i).isVisitado() == false) {

                lista_ady.get(i).setVisitado(true);
                cola.add(lista_ady.get(i));

                VertiseListaAdy actual;

                while (!cola.isEmpty()) {
                    actual = cola.poll();
                    actual.setVisitado(true);
                    //   recorrido.add(actual);

                    for (int k = i; k < lista_ady.size(); k++) {
                        if (lista_ady.get(k).getDato() == actual.getDato()) {
                            lista_ady.get(i).setVisitado(true);
                        }
                    }

                    for (int j = 0; j < actual.getAristas().size(); j++) {
                        if (actual.getAristas().get(j).isVisitado() == false) {
                            recorrido.add(actual.getAristas().get(j));
                            cola.add(actual.getAristas().get(j));
                        }
                    }

                    actual.setVisitado(true);

                }
            }
        }
        ponerListaAdyFalse();
        return recorrido;
    }

    public LinkedList<VertiseListaAdy> recorridoDFS() {
        LinkedList<VertiseListaAdy> recorrido = new LinkedList<>();

        for (int i = 0; i < lista_ady.size(); i++) {
            recorridoDFSlogica(lista_ady.get(i).getDato(), recorrido);
        }
        recorrido.add(lista_ady.get(0).getDato(), lista_ady.get(0));
        ponerListaAdyFalse();
        return recorrido;

    }

    public void recorridoDFSlogica(int actual, LinkedList<VertiseListaAdy> recorrido) {

        //System.out.println("antes");
        //System.out.println(lista_ady.size());
        //System.out.println(actual);
        //System.out.println("");
        if (lista_ady.size() != actual) {
            if (lista_ady.get(actual).isVisitado() == false) {

                //System.out.println("despues");
                //System.out.println(lista_ady.get(actual).getDato());
                lista_ady.get(actual).setVisitado(true);
                recorrido.add(lista_ady.get(actual));

                for (int i = 0; i < lista_ady.get(actual).getAristas().size(); i++) {
                    recorridoDFSlogica(lista_ady.get(actual).getAristas().get(i).getDato(), recorrido);
                }
            }
        }

    }

    public void ponerListaAdyFalse() {

        for (int i = 0; i < lista_ady.size(); i++) {
            lista_ady.get(i).setVisitado(false);
            for (int j = 0; j < lista_ady.get(i).getAristas().size(); j++) {
                lista_ady.get(i).getAristas().get(j).setVisitado(false);
            }
        }

    }
 
    public void mostraradyAcentesCadaVertise(){
        for (VertiseListaAdy v : lista_ady) {
            System.out.print(v.getDato()+" ");
            for (VertiseListaAdy ady : v.getAristas()) {
                System.out.print(" >>> "+ady.getDato());
            }
            System.out.println("");
        }
    }
    
    
    // Getters anf seters

    public LinkedList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(LinkedList<Arista> aristas) {
        this.aristas = aristas;
    }

    public LinkedList<VertiseListaAdy> getLista_ady() {
        return lista_ady;
    }

    public void setLista_ady(LinkedList<VertiseListaAdy> lista_ady) {
        this.lista_ady = lista_ady;
    }


}
