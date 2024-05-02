package fr.diginamic.banque.entites;

public class Compte {
	//attributs de classe-> private et setters/getters public
	private String numeroDeCompte;
	private double solde;
	//
	//Compte() {}//constructeur sans arguments
	public Compte(String num, double solde) {//constructeur avec arguments
		this.numeroDeCompte = num;
		this.solde = solde;
	}//fin constructeur()
	//Setters et Getters
	public String getNumeroDeCompte() {
		return numeroDeCompte;
	}
	public void setNumeroDeCompte(String numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public String toString() {
		return numeroDeCompte+" "+solde+" €";
	}
	
}
