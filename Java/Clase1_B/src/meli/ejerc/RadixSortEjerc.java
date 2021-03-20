package meli.ejerc;

import java.util.ArrayList;
import java.util.HashMap;

public class RadixSortEjerc {
    public static void radixSort(int[] intArray) {
        // Conversion of int Array to String Array
        String[] stringArray = StringUtil.toStringArray(intArray);

        // Normalize the elements of the String Array
        StringUtil.lNormalize(stringArray, '0');

        // Set the maxLength of the elements of the array
        int length = StringUtil.maxLength(stringArray)-1;
        while (length != -1) {
            // Create the has map that we gonna use in the Sort
            HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();
            for (int i = 0; i <= 9; i++) {
                ArrayList<String> flagOne = new ArrayList<>();
                hashMap.put(i, flagOne);
            }

            // Here we iterate the Array of strings to get the character by the lenth value
            for (int i = 0; i < stringArray.length; i++) {
                String stringValue = stringArray[i];
                String charAtPos = String.valueOf(stringValue.charAt(length));
                var intValueOfChar = Integer.parseInt(charAtPos);
                // Get the array value of the hashMap with the value of the char
                var arrayOfHashNumber = hashMap.get(intValueOfChar);
                arrayOfHashNumber.add(stringValue);

                // Now, we add the element to that array
                hashMap.put(intValueOfChar, arrayOfHashNumber);
            }

            // Here we create a Array with the elements of every array on the HashMap
            ArrayList<String> arrayList = new ArrayList<>();
            for (int j = 0; j < hashMap.size(); j++) {
                var flagArray = hashMap.get(j);
                for (String s : flagArray) {
                    arrayList.add(s);
                }
            }

            // Replace the original Array with the elements of the sorted Array
            for (int i = 0; i < arrayList.size(); i++) {
                stringArray[i] = arrayList.get(i);
            }

            // Cleaning the hashMap for avoid redundancies
            hashMap.clear();
            // Change the length value for continue the sort algorithm with the next position
            length--;
        }

        // Replace the Int Array elements with the String Array
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

    }


    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        radixSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }
    }

}
