package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		//Créer une map nommée map3 qui contient l'ensemble des données des deux autres map
		// avec les memes clées et valeurs
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map1);//Pour copier map1 dan map3 
		map3.putAll(map2);//Pour copier map2 dans map3
		System.out.println("map3: "+map3.size());//pour verifier la taille de map3
		Object key = 0;//pour les cle de type int
		Object value = null;//pour les valeurs de type String
		//
		Iterator<Integer> keyiter = map3.keySet().iterator();//iterateur sur les cles
		Iterator<String> valuesiter = map3.values().iterator();//iterateur sur les valeurs
		while(keyiter.hasNext() && valuesiter.hasNext()) {
			key = keyiter.next();
			value = valuesiter.next();
			System.out.println("->"+key.toString()+" "+value.toString());
		}
	}//fin main()

}//fin Classe()
