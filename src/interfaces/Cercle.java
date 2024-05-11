package interfaces;

public class Cercle implements ObjetGeometrique{
	//attribut: rayon de type double
	private double rayon;
	//
	public Cercle() {
		this.rayon = 0.0;
	}//constructeur sans arguments
	public Cercle(double rayon) {
		this.rayon = rayon;
	}//constructeur avec arguments
	//
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	//toString()
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		final double PI = Math.PI;//constante pi
		double perimetre = (rayon*2)*PI;
		return perimetre;
	}
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		final double PI = Math.PI;//constante pi
		double surface = (rayon*rayon)*PI;
		return surface;
	}
	
}
