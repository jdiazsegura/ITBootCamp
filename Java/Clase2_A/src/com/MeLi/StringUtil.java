package com.MeLi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String string = Character.toString(c);
        return string.repeat(n);
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String string, int length, char filler) {
        int fillCount = length - string.length();

        String filling = replicate(filler, fillCount);

        return filling + string;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        String[] stringArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            stringArray[i] = String.valueOf(arr[i]);
        }
        return stringArray;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        int[] intArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArray[i] = Integer.parseInt(arr[i]);
        }
        return intArray;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int flag2 = 0;
        for (int i = 0; i < arr.length; i++) {
            String flag = arr[i];
            if (flag2 < flag.length()) {
                flag2 = flag.length();
            }
        }
        return flag2;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {
        int maxLong = maxLength(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = lpad(arr[i], maxLong, c);
        }
    }

    // lpad pero agregando caracteres a la derecha
    public static String rpad(String string,char filler, int length){
        int fillCount = length - string.length();

        String filling = replicate(filler, fillCount);

        return  string + filling;
    }

    // Retorna una cadena identica a s pero sin espacios a la izquierda
    public static String ltrim(String s){
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        String ltrim = s.substring(i);
        return ltrim;
    }

    // Retorna una cadena identica a s pero sin espacios a la derecha
    public static String rtrim(String s){
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        String rtrim = s.substring(0,i+1);
        return rtrim;
    }

    // Retorna una cadena identica a s pero sin espacios a la derecha e izquierda
    public static String trim(String s){
        return s.trim();
    }

    public static int indexOfN(String s,char c,int n){
        //TODO
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(ltrim("   Hola "));
        System.out.println(trim("    Holaa  "));

    }
}
