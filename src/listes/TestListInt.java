package listes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayList d'entiers
		ArrayList<Integer> list = new ArrayList<Integer>();
		//placer les elements suivants:  -1, 5, 7, 3, -2, 4, 8, 5
		Collections.addAll(list, -1, 5, 7, 3, -2, 4, 8, 5);
		//afficher la liste des elements
		for(Integer nb : list) {
			System.out.print(" "+nb);
		}
		//Afficher la taille de la liste
		System.out.println("\ntaille: "+list.size());
		//rechercher et afficher le plus grand element de la liste
		int max = 0;
		for(Integer nb : list) {
			if(nb>max) {
				max=nb;
			}//fin if()
		}//fin for()
		System.out.println("max: "+max);
		System.out.println("max collection: "+Collections.max(list));
		//Supprimer le plus petit element de la liste
		System.out.println("min: "+Collections.min(list));
		list.remove(Collections.min(list));
		for(Integer nb : list) {
			System.out.print(" "+nb);
		}
		//Rechercher les elements negatifs et modifiez les pour qu'ils deviennent positif
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			int nb = iter.next();
			if(nb<0) {
				//nb = nb*-1;	
				Collections.replaceAll(list,nb,nb*-1);//OK
			}
			
		}
		//afficher la liste resultante
		System.out.print("\n****************\n");
		for(Integer nb : list) {
			System.out.print(" "+nb);
		}
	}//fin main()

}//fin Classe()
