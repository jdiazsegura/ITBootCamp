package com.meli;

public class SortUtil {
    public static <T> void ordenar(Precedable<T> arr[]) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].precedeAT((T) arr[i + 1]) == 1) {
                    var flag = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = flag;
                }
            }
        }
    }
}
