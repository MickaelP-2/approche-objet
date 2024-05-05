package fr.diginamic.formes;

public class Rectangle extends Forme{
	
	private double longueur;
	private double largeur;
	public Rectangle(double val1, double val2) {
		this.longueur = val1;
		this.largeur = val2;
	}
	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		double surface = longueur*largeur;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		double perimetre = (longueur*2)+(largeur*2);
		return perimetre;
	}
	//Carre est une variante de rectangle
	
}
