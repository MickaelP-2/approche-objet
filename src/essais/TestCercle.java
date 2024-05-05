package essais;
//
import entite.Cercle;

//
public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c1 = new Cercle(3.25);
		Cercle c2 = new Cercle(5.00);
		//
		System.out.println("Cercle1:\n perimetre: "+c1.perimetreCercle()+"\n surface: "+c1.surfaceCercle());
		System.out.println("Cercle2:\n perimetre: "+c2.perimetreCercle()+"\n surface: "+c2.surfaceCercle());
	}

}
