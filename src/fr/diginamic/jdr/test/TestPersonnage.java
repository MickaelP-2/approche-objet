package fr.diginamic.jdr.test;
//
import fr.diginamic.jdr.classe.Personnage;

public class TestPersonnage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage perso1 = new Personnage();
		System.out.println(">"+perso1.toString());//tirage aleatoire =OK
		perso1.setForce(15);
		perso1.setPv(47);
		perso1.setScore(111);
		Personnage perso2 = new Personnage(16,42,25);
		System.out.println(perso1.toString());
		System.out.println(perso2.toString());
	}

}
