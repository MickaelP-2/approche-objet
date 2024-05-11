package maps;

import java.util.HashMap;

public class CreationMap {
	/**
	 * Liste d'employés
	 * Paul – 1750 €
 	 * Hicham – 1825 €
 	 * Yu – 2250 €
 	 * Ingrid – 2015 €
 	 * Chantal – 2418 €
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creation d'un map-> HashMap
		HashMap<String, Integer> hmap = new HashMap<>();
		//stocker les informations: cle=nom,valeur=salaire
		hmap.put("Paul",1750);
		hmap.put("Hicham",1825);
		hmap.put("Yu",2250);
		hmap.put("Ingrid",2015);
		hmap.put("Chantal",2418);
		//Afficher la taille du map
		System.out.println("taille de hmap: "+hmap.size());
		
	}//fin main()

}//fin Classe()
