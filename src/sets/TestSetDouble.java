package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancier un HashSet de type double: HashSet ne preserve pas l'ordre d'instanciation
		//TreeSet conserve l'ordre d'instanciation
		//  valeurs: 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01
		HashSet<Double> set = new HashSet<Double>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		//Affichage avec une boucle objet-> ne conserve pas l'ordre
		/*
		for(Double val : set) {
			System.out.println("val: "+val);
		}
		*/
		System.out.println("******************");
		//Avec un iterator-> Ne conserve pas l'ordre
		Iterator<Double> iterator = set.iterator();
		Double val = 0.0;
		while(iterator.hasNext()) {
			val = iterator.next();
			System.out.println("val: "+val);
		}
		System.out.println("******************");
		//Rechercher le plus grand nombre
		System.out.println("max: "+Collections.max(set));
		//Supprimer le plus petit Nombre
		System.out.println("size: "+set.size());
		System.out.println("min: "+Collections.min(set));
		set.remove(Collections.min(set));
		//Afficher la collection modifiée
		iterator = set.iterator();
		System.out.println("size: "+set.size());
		while(iterator.hasNext()) {
			val = iterator.next();
			System.out.println("val: "+val);
		}
		//Afficher la liste
	}//fin main()

}//fin Classe()
