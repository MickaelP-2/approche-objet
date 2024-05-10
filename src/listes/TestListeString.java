package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		//ajouter les elements suivants:  Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
		Collections.addAll(list, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		//rechercher le plus grand nombre de lettres
		String ville = null;
		int longueur = 0;
		for(String str : list) {
			if(str.length()>longueur) {
				longueur = str.length();
				ville = str;
			}
		}
		System.out.println(" "+ville+" avec "+ville.length()+" lettres");
		//Modifier le liste pour afficher les elements en majuscules
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();	
				Collections.replaceAll(list,str,str.toUpperCase());//OK
		}
		//afficher=OK en majuscules
		for(String str : list) {
			System.out.println(" "+str);
		}
		//Supprimer de la liste les villes commancant par N
		System.out.println("\n**********************************************\n");
		iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			if(str.startsWith("N")) {
				iter.remove();//OK
			}
		}
		//affichage de la nouvelle liste
		for(String str : list) {
			System.out.println(" "+str);
		}
	}//fin main()

}//fin classe()
