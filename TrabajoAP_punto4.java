package trabajoa.p_punto4;

import java.util.LinkedList;

public class TrabajoAP_punto4 {

    public static void main(String[] args) {

        GrafoLista gf = new GrafoLista();

        int[] datosPueba = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < datosPueba.length; i++) {
            gf.ingresarVertice(datosPueba[i]);
        }

        int[] arista1 = {1, 2};
        int[] arista2 = {2, 3};
        int[] arista3 = {2, 4};
        int[] arista4 = {4, 5};
        int[] arista5 = {4, 6};
        int[] arista6 = {4, 7};

        gf.ingresarAristayRetornaArsita(arista1[0], arista1[1]);
        gf.ingresarAristayRetornaArsita(arista2[0], arista2[1]);
        gf.ingresarAristayRetornaArsita(arista3[0], arista3[1]);
        gf.ingresarAristayRetornaArsita(arista4[0], arista4[1]);
        gf.ingresarAristayRetornaArsita(arista5[0], arista5[1]);
        gf.ingresarAristayRetornaArsita(arista6[0], arista6[1]);

        System.out.println("\n\nRecorrido BFS");
        LinkedList<VertiseListaAdy> lista2 = gf.recorridoBFS();
        for (VertiseListaAdy vertiseListaAdy : lista2) {
            System.out.print(vertiseListaAdy.getDato() + " ");
        }

        System.out.println("\n\nRecorrido DFS");
        LinkedList<VertiseListaAdy> lista = gf.recorridoDFS();
        for (VertiseListaAdy vertiseListaAdy : lista) {
            System.out.print(vertiseListaAdy.getDato() + " ");
        }

        System.out.println("\n\nGrado vertises");
        for (VertiseListaAdy v : gf.getLista_ady()) {
            System.out.println("Ver: " + v.getDato() + " g: " + v.getAristas().size());
        }

        System.out.println("\nGrado vertises ORDENADO");
        for (int i = gf.getLista_ady().size(); i >= 0; i--) {
            for (VertiseListaAdy v : gf.getLista_ady()) {
                if (v.getAristas().size() == i) {
                    System.out.println("Ver: " + v.getDato() + " g: " + v.getAristas().size());
                }
            }
        }
        
        System.out.println("\nVertise y sus adyasentes");
        gf.mostraradyAcentesCadaVertise();

    }

}
