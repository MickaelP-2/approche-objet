package fr.diginamic.testenumeration;

import java.util.Objects;

/**
 * 
 */
public class Ville {
	private String nom;
	private int nbHabitants;
	private Continents continent;
	
	
	/**
	 * 
	 */
	public Ville(){
		this.nom = null;
		this.nbHabitants = 0;
		this.continent = null;
	}
	/**
	 * 
	 * @param nom
	 * @param habitants
	 * @param class1
	 */
	public Ville(String nom, int habitants,Continents continent){
		this.nom = nom;
		this.nbHabitants = habitants;
		this.continent = continent;
	}
	//
	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}
	/**
	 * 
	 * @param nbHabitants
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	/**
	 * 
	 * @return
	 */
	public Continents getContinent() {
		return continent;
	}
	/**
	 * 
	 * @param continent
	 */
	public void setContinent(Continents continent) {
		this.continent = continent;
	}
	/**
	 * 
	 */
	
	public String toString() {
		return this.nom+" "+this.nbHabitants+" "+this.continent;
	}
	/**
	 * 
	 */
	@Override
	public boolean equals(Object object) {
		
		if(!(object instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville)object;
		return Objects.equals(this.nom, autre.getNom()) && Objects.equals(this.nbHabitants, autre.getNbHabitants()) && Objects.equals(this.continent,autre.getContinent());
	}
}
