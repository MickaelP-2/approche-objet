package fr.diginamic.salaire;

//classe mere des personnes travaillants pour la societe
public abstract class Intervenant {
	//2 attributs
	private String nom;
	private String prenom;
	private String statut;
	//
	public Intervenant(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.statut = "";
	}//fin constructeur()
	//1 clase abstraite getSalaire()
	abstract double getSalaire();//implementée dans les classes filles
	//
	public String verifStatut(Intervenant nomInter) {
		//Classe pour verifier le statut
		this.statut = null;
		if(nomInter instanceof Salarie) {
			this.statut = "salarie";
		}
		if(nomInter instanceof Pigiste) {
			this.statut = "pigiste";
		}
		return this.statut;
	}//fin public String verifStatut()
	public String afficherDonnees() {
		return nom+" "+prenom+"\n "+statut+" "+getSalaire()+" € mensuel";
	}
}//fin Classe intervenant()
