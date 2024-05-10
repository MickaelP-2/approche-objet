package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		//
		for(String couleur : liste1) {
			liste3.add(couleur);
		}//fin for()
		for(String couleur : liste2) {
			liste3.add(couleur);
		}//fin for()
		System.out.println("\n**************boucle for classique**************\n");
		for(int i=0;i<liste3.size();i++) {
			System.out.println(" "+liste3.get(i));
		}//fin for()
		//avec un iterator
		System.out.println("\n*************boucle objet avec iterator***************\n");
		Iterator<String> iter = liste3.iterator();
		while(iter.hasNext()) {
			String nom = iter.next();
			System.out.println(" "+nom);
		}//fin while()
	}//fin main()

}//fin Classe()
