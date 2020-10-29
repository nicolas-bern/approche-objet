package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {

        Compte monCompte = new Compte(1, 10_000);
        System.out.println("Instance de mon compte : " + monCompte);
    }
}
