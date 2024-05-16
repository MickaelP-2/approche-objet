package fr.diginamic.testenumeration;



public enum Continents {
	AMERIQUE("Amérique"),
	AFRIQUE("Afrique"),
	ASIE("Asie"),
	EUROPE("Europe"),
	OCEANIE("Océanie");
	/**
	 * 
	 */
	private String libelle;
	/**
	 * 
	 * @param nom
	 */
	private Continents(String nom){
		this.libelle = nom;
	}
	/**
	 * 
	 * @return
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * 
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * 
	 */
	 public String toString() {
		 return this.libelle;
	 }
}
