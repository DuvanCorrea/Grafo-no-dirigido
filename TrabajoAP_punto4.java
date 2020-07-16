package trabajoa.p_punto4;

import java.util.LinkedList;

public class TrabajoAP_punto4 {

    public static void main(String[] args) {

        GrafoLista gf = new GrafoLista(0);

        int[] datosPueba = {1, 2, 3, 4, 5, 6, 7};

        // insertando aristas
        for (int i = 0; i < datosPueba.length; i++) {
            gf.insertarNodo(datosPueba[i]);
        }
        
        //
        //
        //
        //
        //
        int[] arista1 = {1, 2};
        int[] arista2 = {2, 3};
        int[] arista3 = {2, 4};
        int[] arista4 = {4, 5};
        int[] arista5 = {4, 6};
        int[] arista6 = {4, 7};
        
        gf.insertarArista(arista1[0], arista1[1]);
        gf.insertarArista(arista2[0], arista2[1]);
        gf.insertarArista(arista3[0], arista3[1]);
        gf.insertarArista(arista4[0], arista4[1]);
        gf.insertarArista(arista5[0], arista5[1]);
        gf.insertarArista(arista6[0], arista6[1]);
        
        System.out.println("\n\nRecorrido DFS\n");
        LinkedList<VertiseListaAdy> lista = gf.DFSLista();
        
        
        
        

    }

}
