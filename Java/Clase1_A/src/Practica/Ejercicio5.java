package Practica;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese N:");
        int cantidadMostrar = scanner.nextInt();

        System.out.println("Ingrese M:");
        int cantidadDigitos = scanner.nextInt();

        System.out.println("Ingrese D:");
        char digito = (char)scanner.nextInt();

        int b = 0;

        for(Integer i = 0; b < cantidadMostrar ;i++) {
            if(contarDigitos(i, digito) == cantidadDigitos){
                System.out.println(i);
                b++;
            }
        }

        scanner.close();
    }

    public static int contarDigitos(Integer numero, char digito){
        String str = numero.toString();
        boolean flag = false;
        int count = 0;

        for (char c : str.toCharArray()) {
            if(c == digito){
                count++;
            }
        }

        return count;
    }
}
