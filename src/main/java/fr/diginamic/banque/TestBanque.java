package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {

        Compte monCompte = new Compte(1, 10_000);
        CompteTaux secondCompte = new CompteTaux(2, 20_000, 3);

        Compte[] array = {monCompte, secondCompte};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
