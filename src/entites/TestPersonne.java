package entites;

import entites2.Personne;
public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers1 = new Personne("Bon","Jean",new AdressePostale(11,"rue des champs",34000,"Montpellier"));
		/*
		pers1.nom = "Bon";
		pers1.prenom = "Jean";
		pers1.adressePostale = new AdressePostale();
		pers1.adressePostale.numeroDeRue = 11;
		pers1.adressePostale.libelleDeRue = " rue des champs";
		pers1.adressePostale.numeroDeRue = 34000;
		pers1.adressePostale.ville = "Montpellier";
		*/
		System.out.println(" "+pers1.nom+" "+pers1.prenom+"\n "+pers1.adressePostale.numeroDeRue+" "+pers1.adressePostale.libelleDeRue+" "+pers1.adressePostale.codePostal+" "+pers1.adressePostale.ville);
		Personne pers2 = new Personne("Bonot","Jean",new AdressePostale(31,"impasse du fonds",30000,"Nimes"));
		System.out.println(" "+pers2.nom+" "+pers2.prenom+"\n "+pers2.adressePostale.numeroDeRue+" "+pers2.adressePostale.libelleDeRue+" "+pers2.adressePostale.codePostal+" "+pers2.adressePostale.ville);
		//Le nombre de lignes est netement reduit.
		/*
		pers2.nom = "Bonot";
		pers2.prenom = "Jean";
		pers2.adressePostale = new AdressePostale();
		pers2.adressePostale.numeroDeRue = 31;
		pers2.adressePostale.libelleDeRue = " impasse du fond";
		pers2.adressePostale.numeroDeRue = 30000;
		pers2.adressePostale.ville = "Nimes";
		*/
	}

}
