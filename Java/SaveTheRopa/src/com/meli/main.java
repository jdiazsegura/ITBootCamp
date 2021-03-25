package com.meli;

import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        Prenda prenda1 = new Prenda("Gucci", "Special");
        Prenda prenda2 = new Prenda("Zara","V1");
        Prenda prenda3 = new Prenda("Valenciaga","Summer");

        ArrayList<Prenda> arrayList = new ArrayList<Prenda>();
        arrayList.add(prenda1);
        arrayList.add(prenda2);
        arrayList.add(prenda3);

        ArrayList<Prenda> arrayList2 = new ArrayList<Prenda>();
        arrayList2.add(prenda1);
        arrayList2.add(prenda2);
        arrayList2.add(prenda3);

        ArrayList<Prenda> arrayList3 = new ArrayList<Prenda>();
        arrayList3.add(prenda1);
        arrayList3.add(prenda2);

        GuardarRopa guardarRopa = new GuardarRopa();
        guardarRopa.crearArreglo(arrayList);
        guardarRopa.crearArreglo(arrayList2);
        guardarRopa.mostrarPrendas();
        guardarRopa.devolverPrendas(0);
        guardarRopa.mostrarPrendas();
        guardarRopa.crearArreglo(arrayList3);
        guardarRopa.mostrarPrendas();
    }
}
