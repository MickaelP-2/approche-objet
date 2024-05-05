package fr.diginamic.formes;

public class Carre extends Rectangle{

		private double longueur;
	public Carre(double val1,double val2) {
		super(val1,0);
		this.longueur = val1;
	}
	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		double surface = longueur*longueur;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		double perimetre = longueur*4;
		return perimetre;
	}
	//Carre est une variante de rectangle
}
