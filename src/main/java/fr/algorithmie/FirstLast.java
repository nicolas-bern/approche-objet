package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        int[] array = new int[(int)(Math.random()*21)];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }

        //int[] array = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6};
        boolean val = false;

        if (array.length >= 1 && array[0] == array[array.length-1]){
            val = true;
        }

        for (int elem: array){
            System.out.println(elem);
        }

        System.out.println(val);
    }
}
