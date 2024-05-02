package diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte1 = new Compte("12341234",1500.00);
		System.out.println(" Numéro de compte: "+compte1.getNumeroDeCompte()+"\n Solde: "+compte1.getSolde());
		compte1.setSolde(1234.00);
		System.out.println(" Numéro de compte: "+compte1.getNumeroDeCompte()+"\n Solde: "+compte1.getSolde());
		System.out.println(compte1);
		compte1.toString();
	}//fin main()
}//finclasse()
