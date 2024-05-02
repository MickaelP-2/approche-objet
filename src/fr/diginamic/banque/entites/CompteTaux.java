package fr.diginamic.banque.entites;
//

public class CompteTaux extends Compte{
	public double taux_remuneration;
	//
	public CompteTaux(double taux_remuneration) {
		//Constructeur de classe fille
		super("123123123",1250.0);
		this.taux_remuneration = taux_remuneration;
	}
	//setters et getters
	public double getTaux_remuneration() {
		return taux_remuneration;
	}
	public void setTaux_remuneration(double taux_remuneration) {
		this.taux_remuneration = taux_remuneration;
	}
	//methode toString() de la classe fille
	public String toString() {
		return super.toString()+" "+taux_remuneration+" %";
	}
}
