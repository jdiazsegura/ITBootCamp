package com.meli;

public class main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Jose",123456);
        Persona persona2 = new Persona("Wendy", 123457);
        Persona persona3 = new Persona("Carlos",113456);
        Persona persona4 = new Persona("Luisa", 223456);
        Persona persona5 = new Persona("Jenny",103456);

        Persona[] arreglo = new Persona[5];
        arreglo[0] = persona1;
        arreglo[1] = persona2;
        arreglo[2] = persona3;
        arreglo[3] = persona4;
        arreglo[4] = persona5;

        for (var Persona: arreglo) {
            System.out.println(Persona.toString());
        };
        SortUtil.ordenar(arreglo);
        System.out.println("/n");
        for (var Persona: arreglo) {
            System.out.println(Persona.toString());
        };
    }
}
