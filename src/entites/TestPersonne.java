package entites;

import entites2.Personne;
public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adress1 = new AdressePostale(11,"rue des champs",34000,"Montpellier");
		Personne pers1 = new Personne("Bon","Jean",adress1);
		pers1.afficherPersonne();
		AdressePostale adress2 = new AdressePostale(22,"rue des champs",33000,"Bordeaux"); 
		/*
		pers1.nom = "Bon";
		pers1.prenom = "Jean";
		pers1.adressePostale = new AdressePostale();
		pers1.adressePostale.numeroDeRue = 11;
		pers1.adressePostale.libelleDeRue = " rue des champs";
		pers1.adressePostale.numeroDeRue = 34000;
		pers1.adressePostale.ville = "Montpellier";
		*/
		//System.out.println(" "+pers1.nom+" "+pers1.prenom+"\n "+pers1.adressePostale.numeroDeRue+" "+pers1.adressePostale.libelleDeRue+" "+pers1.adressePostale.codePostal+" "+pers1.adressePostale.ville);
		
		pers1.modifierAdressePostale(adress2);
		pers1.afficherPersonne();
		
	}

}
