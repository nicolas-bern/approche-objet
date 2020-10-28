package entites;

public class AdressePostale {

    private int numeroRue;
    private String rueNom;
    private int postalCode;
    private String nomVille;

    public AdressePostale(int numRue, String nomRue, int codePostal, String ville){
        this.numeroRue = numRue;
        this.rueNom = nomRue;
        this.postalCode = codePostal;
        this.nomVille = ville;
    }

    public int getNumeroRue(){return numeroRue;}
    public String getRueNom(){return rueNom;}
    public int getPostalCode(){return postalCode;}
    public String getNomVille(){return nomVille;}
}
