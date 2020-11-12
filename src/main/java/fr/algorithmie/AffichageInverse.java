package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};


        for (int elem: array){
            System.out.println(elem);
        }

        System.out.println("");

        for (int i = array.length-1; i > -1; i--) {
            System.out.println(array[i]);
        }

        System.out.println("");

        int[] arrayCopy = array.clone();
        for (int elem: arrayCopy){
            System.out.println(elem);
        }
    }
}
