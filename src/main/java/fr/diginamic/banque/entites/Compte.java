package fr.diginamic.banque.entites;

public class Compte {

    protected int numeroCompte;
    protected int soldeCompte;

    public Compte(int numeroCompte, int soldeCompte){
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "numeroCompte = " + numeroCompte + ", soldeCompte = " + soldeCompte;
    }
}
