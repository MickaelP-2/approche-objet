package listes;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verifier si equals renvoie true si 2 villes ont les memes attributs
		Ville v1 = new Ville("Nom1",12500);
		Ville v2 = new Ville("Nom1",12500);
		System.out.println("equals>"+v1.equals(v2));//OK
		if((v1.getNom() == v2.getNom()) && (v1.getNbHabitants() == v2.getNbHabitants())) {
			System.out.println("==>OK");
		}else System.out.println("==>!OK");
			
		//verifier si false avec changement d'un attribut
		v1 = new Ville("Nom1",12500);
		v2 = new Ville("Nom2",12500);
		System.out.println("equals>"+v1.equals(v2));//OK
		if((v1.getNom() == v2.getNom()) && (v1.getNbHabitants() == v2.getNbHabitants())) {
		//if(v1 == v2) {
			System.out.println("==>OK");
		}else System.out.println("==>!OK");
		//Pour que l'operateur == renvoie true: enlever le new ville()
		//en comparant les valeursdes attributs
		//+ cf Villes pour redefinition de equals(Object obj){..}
	}

}
