package entites2;

import entites.AdressePostale;

public class Personne {

		public String nom;
		public String prenom;
		public AdressePostale adressePostale;
		//
		public Personne() {
			
		}//fin constructeur()
		public Personne(String nom, String prenom, AdressePostale adrpost) {
			this.nom = nom;
			this.prenom = prenom;
			this.adressePostale = adrpost;
		}//fin constructeur avec arguments()
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}