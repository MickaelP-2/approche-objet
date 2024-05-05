package essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Forme;
//
public class AffichageForme {
	//
	public void afficher(Forme forme) {
		//Cette methode prend en argument un objet de type Forme et affiche perimetre et surface
		System.out.println("perimetre: "+forme.calculerPerimetre());
		System.out.println("surface: "+forme.calculerSurface());
	}//fin public void afficher()
}
