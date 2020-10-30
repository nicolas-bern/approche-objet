package sets;

import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> hash = new HashSet<Double>();

        hash.add(1.5);
        hash.add(8.25);
        hash.add(-7.32);
        hash.add(13.3);
        hash.add(-12.45);
        hash.add(48.5);
        hash.add(0.01);

        System.out.println(hash);


        Double indicMin = Double.MIN_VALUE;
        for (Double valeur: hash){
            if(indicMin < valeur){
                indicMin = valeur;
            }
        }

        System.out.println("La plus grande valeure est : " + indicMin);


        Double indicMax = Double.MAX_VALUE;
        for (Double valeur: hash){
            if (indicMax > valeur){
                indicMax = valeur;
            }
        }

        hash.remove(indicMax);
        System.out.println("HasSet sans plus petit nombre : " + hash);
    }
}
