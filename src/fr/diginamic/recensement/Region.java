package fr.diginamic.recensement;

import java.util.Comparator;

public class Region implements Comparator<Region>{
	//pour les 10 regions les plus peuplees
	//codeRegion
	//nomRegion
	//departements differents -> region meme nom
	//populationTotale
	private String codeRegion;
	private String nomRegion;;
	private int populationTotale;
	
	//
	public Region() {
		this.codeRegion = null;
		this.nomRegion = null;
		this.populationTotale = 0;
	}//constructeur sans argument
	public Region(String codeRegion, String nomRegion, String codeDepartement, String nomDepartement, int population) {
		this.codeRegion = null;
		this.nomRegion = null;
		this.populationTotale = 0;
	}//constructeur avec arguments
	//
	public String getCodeRegion() {
		return codeRegion;
	}
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
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
		return "Region [Code Région = " + codeRegion + ", Nom de la Région = " + nomRegion + ", Population totale = " + populationTotale + "]";
	}
	@Override
	public int compare(Region o1, Region o2) {
		// TODO Auto-generated method stub
		int res = 0;
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
