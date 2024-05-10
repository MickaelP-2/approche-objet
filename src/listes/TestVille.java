package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> list = new ArrayList<Ville>();
		/*
			Ville ville1 = new Nice, 343 000 hab.
			o Carcassonne, 47 800 hab.
			o Narbonne, 53 400 hab.
			o Lyon, 484 000 hab.
			o Foix, 9 700 hab.
			o Pau, 77 200 hab.
			o Marseille, 850 700 hab.
			o Tarbes, 40 600 hab
		  */
		Collections.addAll(list,new Ville("Nice",343000) , new Ville("Carcassonne",47800), new Ville("Narbonne",53400), new Ville("Lyon",484000), new Ville("Foix",9700), new Ville("Pau",77200), new Ville("Marseille",850700), new Ville("Tarbes",40600));
		//rechercher et afficher la ville la plus peuplée
		String villelue = null;
		int population = 0;
		for(Ville ville : list) {
			if(ville.getNbHabitants()>population) {
				population = (int)ville.getNbHabitants();
				villelue = ville.getNom();
			}
		}
		System.out.println("Ville la plus peuplée est "+villelue+" avec "+population+" habitants.");
		//Supprimer la ville la moins peuplée
		population = 10000;//valeur par defaut
		for(Ville ville : list) {
			if(ville.getNbHabitants()<population) {
				population = (int)ville.getNbHabitants();
				villelue = ville.getNom();
			}
			System.out.println(" "+ville.getNbHabitants()+" population: "+population);
		}
		System.out.println("Ville la moins peuplée est "+villelue+" avec "+population+" habitants.");
		//Modifier les villes de plus de 100000 habitants en majuscules
		System.out.println("\n*******************\n");
		for(Ville ville : list) {
			if(ville.getNbHabitants()>100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		//afficher la liste resultante
		for(Ville ville : list) {
			System.out.println(" "+ville.toString());
		}
		//
	}//fin main()

}//fin Classe()
