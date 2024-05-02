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
		//
		public void afficherNom() {
			System.out.println(nom.toUpperCase()+" "+nom);
			
		}//fin public void afficherNom()
		public void modifierNom(String nom) {
			this.nom = nom;
		}//fin public void modifierNom()
		public void modifierPrenom(String prenom) {
			this.prenom = prenom;
		}//fin public void modifierPrenom()
		public void modifierAdressePostale(AdressePostale adrp) {
			this.adressePostale.numeroDeRue = adrp.numeroDeRue;
			this.adressePostale.libelleDeRue = adrp.libelleDeRue;
			this.adressePostale.codePostal = adrp.codePostal;
			this.adressePostale.ville = adrp.ville;
		}
		public String Nom() {
			return nom;
		}
		public String Prenom() {
			return prenom;
		}
		public AdressePostale adresse() {
			return adressePostale;
		}
		public void afficherPersonne() {
			System.out.println(" Nom: "+this.nom.toUpperCase()+ " Prenom: "+this.prenom+"\n adresse: "+this.adressePostale.numeroDeRue+" "+this.adressePostale.libelleDeRue+"\n "+this.adressePostale.codePostal+" "+this.adressePostale.ville);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}