package fichier;

public class Ville {
	/**
	 * Créer une classe ville avec les attributs suivants
	 * Nom
	 * Code département
	 * Nom de la région
	 * Population totale
	 */
	private String nom;
	private String codeDepartement;
	private String nomRegion;
	private String populationTotale;
	
	public Ville() {
		this.nom = null;
		this.codeDepartement = null;
		this.nomRegion = null;
		this.populationTotale = null;
	}//fin construteur()
	public Ville(String nom, String codeDepartement,String nomRegion,String populationTotale) {
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}//fin construteur()
	//Setters et getters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(String populationTotale) {
		this.populationTotale = populationTotale;
	}
	//public toString()
	public String toString() {
		return nom+" "+codeDepartement+" "+nomRegion+" "+populationTotale;
	}
}
