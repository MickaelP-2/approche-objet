package entite;

public class Cercle {
	//attribut d'instance
	private double rayon;
	final double PI = Math.PI;
	//
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	//Perimetre = (rayon*2)*PI 
	public double perimetreCercle() {
		double perimetre =  (rayon*2)*PI;
		return perimetre;
	}
	//Surface = (rayon*rayon*PI)
	public double surfaceCercle() {
		double surface =  (rayon*rayon)*PI;
		return surface;
	}
}
