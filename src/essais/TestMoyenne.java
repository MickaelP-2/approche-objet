package essais;
import operations.CalculMoyenne;//Pour importer la classe CalculMoyenne

public class TestMoyenne {
//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculMoyenne CM = new CalculMoyenne();//Pour  utiliser une instance de CalculMoyenne
		//et acceder aux methodes de la classe
		//System.out.println("len: "+CM.getTablo().length);
		CM.ajout(14.75);
		CM.ajout(5.25);
		CM.ajout(10);
		//System.out.println("len: "+CM.getTablo().length);
		System.out.println("Moyenne de: "+CM.calcul());
		CM.ajout(-1.25);
		CM.ajout(17.25);
		//System.out.println("len: "+CM.getTablo().length);
		System.out.println("Moyenne de: "+CM.calcul());
		
	}//fin main()

}//fin Classe()
