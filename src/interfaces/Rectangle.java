package interfaces;

public class Rectangle implements ObjetGeometrique{
	//2 attributs: longueur,largeur
	private double longueur;
	private double largeur;
	//
	public Rectangle() {
		this.longueur = 0.0;
		this.largeur = 0.0;
	}//constructeur sans arguments
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}//constructeur avec arguments
	//
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	//
	public double perimetre() {
		double perimetre = (longueur+largeur)*2;
		return perimetre;
	}
	public double surface() {
		double surface = longueur*largeur;
		return surface;
	}
}
