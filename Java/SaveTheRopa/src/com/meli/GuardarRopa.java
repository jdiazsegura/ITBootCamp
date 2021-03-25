package com.meli;

import java.util.ArrayList;
import java.util.HashMap;

public class GuardarRopa {

    public static int id = 0;
    HashMap<Integer, ArrayList<Prenda>> arreglo = new HashMap<>();

    public void crearArreglo(ArrayList<Prenda> ropa) {
        if (arreglo.size() == 0){
            arreglo.put(id, ropa);
        }else {
            for (int i = 0; i < arreglo.size(); i++) {
                if (arreglo.get(i).isEmpty()) {
                    arreglo.put(i, ropa);
                    break;
                } else {
                    arreglo.put(id, ropa);
                    break;
                }
            }
        }
        id++;
    }

    public void mostrarPrendas() {
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(i);
            for (var element : arreglo.get(i)) {
                System.out.println(element.toString());
            }
        }
    }

    public ArrayList<Prenda> devolverPrendas(Integer numero) {
        var flag = new ArrayList<Prenda>();
        if (arreglo.containsKey(numero)) {
            arreglo.get(numero).clear();
        }
        return flag;
    }
}

