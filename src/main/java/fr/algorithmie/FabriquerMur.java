package fr.algorithmie;

public class FabriquerMur {
    public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur){
        int smallTotal = nbSmall * 1;
        int bigTotal = nbBig * 5;

        if(bigTotal + smallTotal >= longueur){
            return true;
        } else {
            return false;
        }
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b){
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b){
            System.out.println("On ne peut pas construire un mur de longueur " + longueur + " avec " + nbSmall + " briques de longueur 1 et " + nbBig + " briques de longueur 5.");
        } else {
            System.out.println("On peut construire un mur de longueur " + longueur + " avec " + nbSmall + " briques de longueur 1 et " + nbBig + " briques de longueur 5.");
        }
    }

    public static void main(String[] args) {
        verifier(2, 5, 10, true);
        verifier(0, 5, 20, false);
        verifier(1, 3, 30, true);
        verifier(5, 4, 40, false);
        verifier(2, 7, 50, true);
    }
}
