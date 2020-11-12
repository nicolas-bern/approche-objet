package fr.algorithmie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InversionContenu {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        ArrayList<Integer> arrayCopy = new ArrayList<>();

        for (int i = array.length-1; i > -1; i--) {
            arrayCopy.add(array[i]);
        }

        for (int elem: array){
            System.out.println(elem);
        }

        System.out.println(arrayCopy);
    }
}
