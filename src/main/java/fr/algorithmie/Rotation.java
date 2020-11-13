package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;

public class Rotation {
    public static void main(String[] args) {

        int[] array = new int[(int)(Math.random()*21)];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }

        boolean isDone = false;
        int temp = 0;
        int temp2 = 0;

        System.out.println("Avant la rotation : " + Arrays.toString(array));

        while (isDone == false){
            for (int i = 0; i < array.length-1; i++) {
                if (i == 0){
                    temp = array[i];
                    temp2 = array[i+1];
                    array[i+1] = temp;
                    array[0] = array[array.length-1];
                }
                else {
                    temp = array[i+1];
                    array[i+1] = temp2;
                    temp2 = temp;
                }
            }
            isDone = true;
        }

        System.out.println("Après la rotation : " + Arrays.toString(array));
    }
}
