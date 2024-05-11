package maps;

public class Pays {
	//3 attributs:string nom, long nbhabitant, String continent
	private String nom;
	private long nbHabitant;
	private String continent;
	//
	public Pays() {
		this.nom = null;
		this.nbHabitant = 0;
		this.continent = null;
	}//constructeur sans argumments
	public Pays(String nom, long nbHabitant,String continent) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}//constructeur sans argumments
	//
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(long nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	//
	public String toString() {
		return nom+" "+nbHabitant+" "+continent;
	}
}
