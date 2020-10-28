package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale(23, "rue d'Aquitaine", 44800, "Saint-Herblain");
        AdressePostale adr2 = new AdressePostale(77, "rue de Bretagne", 44700, "Sautron");

        Personne pers1 = new Personne("Bern", "Nicolas", adr1);
        Personne pers2 = new Personne("Bern", "Anne", adr2);

        System.out.println("Nom : " + pers1.getNom()+ "\n" + "Prenom : " + pers1.getPrenom()+"\n" + "Adresse : " + pers1.getAdr().getNumeroRue() + " " + pers1.getAdr().getRueNom() + " " + pers1.getAdr().getPostalCode() + ", " + pers1.getAdr().getNomVille());
        System.out.println("\n");
        System.out.println("Nom : " + pers2.getNom()+ "\n" + "Prenom : " + pers2.getPrenom()+"\n" + "Adresse : " + pers2.getAdr().getNumeroRue() + " " + pers2.getAdr().getRueNom() + " " + pers2.getAdr().getPostalCode() + ", " + pers2.getAdr().getNomVille());

        System.out.println("\n");

        pers1.setNom("Joli nom");
        pers1.setPrenom("Joli prénom");
        pers1.setAdr(adr2);
        System.out.println(pers1.getNom());
        System.out.println(pers1.getPrenom());
        System.out.println(pers1.getAdr().getNumeroRue() + " " + pers1.getAdr().getRueNom() + " " + pers1.getAdr().getPostalCode() + ", " + pers1.getAdr().getNomVille());
    }
}
