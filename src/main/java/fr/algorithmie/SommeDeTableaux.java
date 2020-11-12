package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        int length = 0;
        int somme = 0;

        if (array.length > array2.length){
            length = array.length;
        }
        else if (array.length == array2.length){
            length = array.length;
        }
        else {
            length = array2.length;
        }

        int[] arraySomme = new int[length];

        for (int i = 0; i < length; i++) {
            somme += array[i] += array2[i];
            arraySomme[i] = somme;
            somme = 0;
        }

        for (int elem: arraySomme){
            System.out.println(elem);
        }
    }
}
