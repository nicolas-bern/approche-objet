package fr.algorithmie;

public class TriABulles {
    public static void main(String[] args) {

        int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        boolean tri = false;
        int comp = 0;

        while (tri == false){
            tri = true;

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    comp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = comp;
                    tri = false;
                }
            }
        }

        for (int elem: array){
            System.out.println(elem);
        }
    }
}
