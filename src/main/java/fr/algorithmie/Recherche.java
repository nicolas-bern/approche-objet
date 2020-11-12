package fr.algorithmie;

public class Recherche {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // Recherche plus grand nombre
        for (int elem: array){
            if (min < elem){
                min = elem;
            }
        }
        System.out.println("Plus grand nombre : " + min);

        // Recherche plus petit nombre
        for (int elem: array){
            if (max > elem){
                max = elem;
            }
        }
        System.out.println("Plus petit nombre : " + max);
    }
}
