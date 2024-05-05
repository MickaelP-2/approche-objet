package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	//2 attributs de classe
	private float nbJour;//Pour le nombre de jours travaillés dans le mois
	private double montantJournalier;//Pour representer le montant journalier
	//
	public Pigiste(String nom, String prenom, float nbJour,double montantJournalier) {
		super(nom,prenom);
		this.nbJour = nbJour;
		this.montantJournalier = montantJournalier;
	}//fin constructeur()
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nbJour*montantJournalier;
	}

}
