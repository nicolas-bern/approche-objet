package fr.algorithmie;

public class TriParSelection {
    public static void main(String[] args) {

        int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        int nbrMin = 0;
        int comp = 0;

        for (int i = 0; i < array.length-1; i++) {
            nbrMin = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[nbrMin]){
                    nbrMin = j;
                }
            }

            if (nbrMin != i){
                comp = array[i];
                array[i] = array[nbrMin];
                array[nbrMin] = comp;
            }

        }

        for(int elem: array){
            System.out.println(elem);
        }
    }
}
