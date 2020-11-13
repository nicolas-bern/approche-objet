package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;

public class Rotation {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        boolean isDone = false;
        int temp = 0;
        int temp2 = 0;

        System.out.println(Arrays.toString(array));

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

        System.out.println(Arrays.toString(array));
    }
}
