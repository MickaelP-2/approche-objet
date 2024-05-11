package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancier un HashSet de String
		//valeur:  USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
		HashSet<String> set = new HashSet<String>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		//Rechercher le pays ayant le plus grand nombre de lettres
		//supprimer ce pays
		Iterator<String> iterator = set.iterator();
		int nb = 0, nb_long=0;
		String pays = null, paysLong = null;
		while(iterator.hasNext()) {
			//System.out.println(">"+iterator.next());
			pays = iterator.next();
			nb = pays.length();
			if(nb_long<pays.length()) {
				nb_long = pays.length();
				paysLong = pays;
			}
		}
		System.out.println("pays: "+paysLong+" nb: "+nb_long);
		//System.out.println("pays nb: "+Collections.max(set));
		set.remove(paysLong);//paysLong et set de type String
		//afficher la collection modifiée
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(">"+iterator.next());
		}
	}//fin main()

}//Fin Classe()
