package essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;
public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1 = new Cercle(4);
		Rectangle rectangle1 = new Rectangle(3,7);
		Carre carre1 = new Carre(3,0);
		System.out.println("Cercle:\n perimetre: "+cercle1.calculerPerimetre()+" surface: "+cercle1.calculerSurface());
		System.out.println("Rectangle:\n perimetre: "+rectangle1.calculerPerimetre()+" surface: "+rectangle1.calculerSurface());
		System.out.println("Carre:\n perimetre: "+carre1.calculerPerimetre()+" surface: "+carre1.calculerSurface());
		
	}

}
