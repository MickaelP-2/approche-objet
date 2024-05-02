package entites;

import entites2.Personne;
public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers1 = new Personne();
		pers1.nom = "Bon";
		pers1.prenom = "Jean";
		pers1.adressePostale = new AdressePostale();
		pers1.adressePostale.numeroDeRue = 11;
		pers1.adressePostale.libelleDeRue = " rue des champs";
		pers1.adressePostale.numeroDeRue = 34000;
		pers1.adressePostale.ville = "Montpellier";
		
		Personne pers2 = new Personne();
		pers2.nom = "Bonot";
		pers2.prenom = "Jean";
		pers2.adressePostale = new AdressePostale();
		pers2.adressePostale.numeroDeRue = 31;
		pers2.adressePostale.libelleDeRue = " impasse du fond";
		pers2.adressePostale.numeroDeRue = 30000;
		pers2.adressePostale.ville = "Nimes";
	}

}
