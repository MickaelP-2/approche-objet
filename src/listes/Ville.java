package listes;

public class Ville {
	private String nom;
	private int nbHabitants;
	
	public Ville(){
		this.nom = null;
		this.nbHabitants = 0;
	}
	public Ville(String nom, int habitants){
		this.nom = nom;
		this.nbHabitants = habitants;
	}
	//

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	//
	public String toString() {
		return this.nom+" "+this.nbHabitants;
	}
	//
	@Override
	public boolean equals(Object object) {
		
		if(!(object instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville)object;
		return nom.equals(autre.getNom());
	}
}
