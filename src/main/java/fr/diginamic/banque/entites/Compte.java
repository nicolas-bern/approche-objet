package fr.diginamic.banque.entites;

public class Compte {

    private int numeroCompte;
    private int soldeCompte;

    public Compte(int numeroCompte, int soldeCompte){
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte{\n" +
                "numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte + "\n" +
                '}';
    }
}
