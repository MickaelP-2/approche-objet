package maps;
//
public class Villes {
	private String nom;
	private int nbHabitants;
	
	public Villes(){
		this.nom = null;
		this.nbHabitants = 0;
	}
	public Villes(String nom, int habitants){
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

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	//
	public String toString() {
		return this.nom+" "+this.nbHabitants;
	}
}
