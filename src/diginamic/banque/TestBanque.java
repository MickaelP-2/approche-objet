package diginamic.banque;

import entite.Compte;
import entite.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte1 = new Compte("12341234",1500.00);
		//**System.out.println(" Numéro de compte: "+compte1.getNumeroDeCompte()+"\n Solde: "+compte1.getSolde());
		compte1.setSolde(1234.00);
		//**System.out.println(" Numéro de compte: "+compte1.getNumeroDeCompte()+"\n Solde: "+compte1.getSolde());
		//Spring m'a refusée de créer un package fr.diginamic.banque:
		//cas présent: Pour changer le solde , il faut que le constructeur de Compte soit public et dans le
		//même package
		//Dans un autre package-ici diginamic.banque , le constructeur n'est pas visible si il est privé-> private Compte(...)
		//Dans un autre package-ici diginamic.banque , le constructeur n'est pas visible si il est de portée package-> Compte(...)
		//(car dans un autre package)
		//Dans le même package, Compte est invisible si il est private, visible si portée package(Compte(...), ou protected Compte(...)
		//Si portée protected de Compte -> visible dans le package , pas dans un autre package et acces aux données private avec setters/getters
		//Si portée public de Compte -> visible dans un autre package, avec import du package(fr.diginamic.banque.entites) de la classe Compte
		// et dans le package
		//**System.out.println(compte1);
		compte1.toString();
		CompteTaux compte2 = new CompteTaux(4.75);
		compte2.setNumeroDeCompte("11223344");
		compte2.setSolde(1275.00);
		//**System.out.println(compte2.toString());
		Compte[] tablo = new Compte[2];//tableau de compte
		tablo[0] = compte1;
		tablo[1] = compte2;
		for (int i=0;i<tablo.length;i++) {
			System.out.println("compte: "+tablo[i]);
		}
	}

}
