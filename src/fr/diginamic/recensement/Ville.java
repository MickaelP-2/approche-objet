package fr.diginamic.recensement;

import java.util.Comparator;

public class Ville implements Comparator<Ville>{
//
	//code region
	//nom de la region
	//code departement
	//code de la commune
	//nom de la commune
	//population totale
	//
	private int codeRegion;
	private String nomRegion;
	private String codeDepartement;//Corse = 2A
	private int codeCommune;
	private String nomCommune;
	private int populationTotale;//inscrit dans le ficheier en string avec espace
	//
	public Ville() {
		this.codeRegion = 0;
		this.nomRegion = null;
		this.codeDepartement = null;
		this.codeCommune = 0;
		this.nomCommune = null;
		this.populationTotale = 0;
	}//fin constructeur sans argument()
	
	public Ville(int codeRegion, String nomRegion,String codeDepartement, int codeCommune, String nomCommune, int population) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = population;
	}//fin constructeur sans argument()
	//

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	//

	@Override
	public String toString() {
		return "Ville [code Region=" + codeRegion + ", Region=" + nomRegion + ", Code Departement=" + codeDepartement
				+ ", Code Commune=" + codeCommune + ", Commune de =" + nomCommune + ", Population Totale="
				+ populationTotale + "]";
	}

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		int res =0;
		if(o1.getPopulationTotale() > o2.getPopulationTotale()) {
			res= -1;
			
		}
		else if(o1.getPopulationTotale() < o2.getPopulationTotale()) {
			res= 1;
			
		}
		else if(o1.getPopulationTotale() == o2.getPopulationTotale()) {
			res= 0;
			
		}
		return res;
	}
	
}
