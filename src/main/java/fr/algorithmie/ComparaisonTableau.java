package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        int nbr = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            nbr = array[i];
            for (int j = 0; j < array2.length; j++) {
                if (nbr == array2[j]){
                    count++;
                }
            }
        }

        System.out.println("Il y a " + count + " éléments en commun avec les deux tableaux");
    }
}
