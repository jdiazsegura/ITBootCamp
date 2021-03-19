package meli.ejerc;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String flag = "";
        for (int i = 0; i < n; i++) {
            flag += c;
        }
        return flag;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        ArrayList<String> arreglo = new ArrayList<>();
        String flag2 = "";
        for (int i = 0; i < s.length(); i++) {
            char flag = s.charAt(i);
            arreglo.add(String.valueOf(flag));
        }
        while(arreglo.size() < n){
            arreglo.add(0,String.valueOf(c));
        }
        for(String variable: arreglo){
            flag2 += variable;
        }
        return flag2;
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
            if(flag2 < flag.length()){
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
            arr[i] = lpad(arr[i],maxLong,c);
        }
    }
}
