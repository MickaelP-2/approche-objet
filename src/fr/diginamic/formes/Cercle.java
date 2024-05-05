package fr.diginamic.formes;

public class Cercle extends Forme{
	
	private double rayon;
	final double PI = Math.PI;//constante pi
	//
	public Cercle(double val){
		
		this.rayon = val;
	}
	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		double surface =  (rayon*rayon)*PI;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		double perimetre =  (rayon*2)*PI;
		return perimetre;
	}

}
