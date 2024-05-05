package operations;

import java.util.Arrays;

public class CalculMoyenne {
//
	private double[] tablo = new double[0];//attribut de classe de type tableau de double
	//
	public void ajout(double val) {
		//Pour gerer la taille du tableau
		tablo = Arrays.copyOf(tablo, tablo.length+1);
		tablo[tablo.length-1] = val;
		//Dernier elmeent d tableau = tablo.length-1
	}//fin public ajout()
	
	public double calcul() {
		//pour calculer la moyenne des elements du tableau
		double somme = 0.0;//moyenne = 0.0;//Pour la calcul de la somme
		for(int i=0;i<tablo.length;i++) {
			somme = somme + tablo[i];
		}//fin for()
		return (somme/tablo.length);
	}//fin public void calcul()
	
}//fin classe()
