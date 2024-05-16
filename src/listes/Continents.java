package listes;

public enum Continents {
	AMERIQUE("Amérique"),
	AFRIQUE("Afrique"),
	ASIE("Asie"),
	EUROPE("Europe"),
	OCEANIE("Océanie");
	
	private String libelle;
	
	Continents(String nom){
		this.libelle = nom;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
