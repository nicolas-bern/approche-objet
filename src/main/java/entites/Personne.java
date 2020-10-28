package entites;

public class Personne {

    private String nom;
    private String prenom;
    private AdressePostale adr;

    public Personne(String nom, String prenom, AdressePostale adr){
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdr() {
        return adr;
    }
}
