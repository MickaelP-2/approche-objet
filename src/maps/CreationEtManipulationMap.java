package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soit la map suivante -> Nom des prefectures et numero de departement
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		//Ajouter dans la map, les informations de: Lille,Lyon,Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		//afficher avec une boucle les cles contenues
		Iterator<Integer> keyiter = mapVilles.keySet().iterator();
		while(keyiter.hasNext()) {
			int key = keyiter.next();
			System.out.println(key);
		}
		//afficher avec une boucle les valeurs contenues
		Iterator<String> valuesiter = mapVilles.values().iterator();
		while(valuesiter.hasNext()) {
			String value = valuesiter.next();
			System.out.println(value);
		}
		//Afficher la taille de la map
		System.out.println("taille de mapVilles: "+mapVilles.size());
	}//fin main()

}//fin Classe()
