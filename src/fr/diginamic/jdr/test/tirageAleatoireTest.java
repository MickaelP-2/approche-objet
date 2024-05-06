package fr.diginamic.jdr.test;
//
import fr.diginamic.jdr.classe.tirageAleatoire;

public class tirageAleatoireTest {
	
	public static int nombre;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tirageAleatoire ta = new tirageAleatoire();
		nombre = ta.D10();
		System.out.println("D10->"+nombre);//OK
		nombre = ta.D6();
		System.out.println("D6->"+nombre);//OK
	}

}
