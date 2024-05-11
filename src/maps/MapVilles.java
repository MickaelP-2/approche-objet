package maps;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Classe Villes: nom,nbhabitant
		//Créer une map pour stocker les instances de villes en fonction du nom: cle=nom
		Villes ville1 = new Villes("Marseille",873076);
		Villes ville2 = new Villes("Montpellier",302454);
		Villes ville3 = new Villes("Nantes",323204);
		Villes ville4 = new Villes("Paris",2133211);
		Villes ville5 = new Villes("Toulouse",504078);
		Villes ville6 = new Villes("Lille",236710);
		Villes ville7 = new Villes("Lyon",522250);
		Villes ville8 = new Villes("Bordeaux",261804);
		HashMap<String, Villes> map = new HashMap<String, Villes>();
		map.put("Marseille",ville1);
		map.put("Montpellier",ville2);
		map.put("Nantes",ville3);
		map.put("Paris",ville4);
		map.put("Toulouse",ville5);
		map.put("Lille",ville6);
		map.put("Lyon",ville7);
		map.put("Bordeaux",ville8);
		//Rechercher et supprimer la ville la moins peuplée
		//iteration par valeur
		Integer pop = 500000;//Valeur par defaut de la population minimum
		Villes ville_cherche = null,ville_lue=null;//pour stocker la ville cherchee et celle utilisée dans la recherche
		String cle_cherche = null, cle_lue = null;//pour stocker la cle cherchee e celle utilisee dans la recherche
		Iterator<String> keyiter = map.keySet().iterator();
		Iterator<Villes> valuesiter = map.values().iterator();
		while(keyiter.hasNext() && valuesiter.hasNext()) {
			cle_lue = keyiter.next();//pour la cle
			ville_lue = valuesiter.next();//pour la valeur-> Ville(nom, nbHabitant)
			//System.out.println(">"+ville.getNom()+" "+ville.getNbHabitants());=OK
			if(ville_lue.getNbHabitants()<pop) {
				pop = ville_lue.getNbHabitants();
				cle_cherche = cle_lue;
				ville_cherche = ville_lue;
			}
		}
		//
		map.remove(cle_cherche);//suppression avec la cle, pas la valeur
		System.out.println("ville supprimée: "+ville_cherche.toString());//OK
		System.out.println("taille de map: "+map.size());//OK suppréssion prise en compte
		valuesiter = map.values().iterator();//Pour afficher la map aprés suppréssion
		while(valuesiter.hasNext()) {
			Villes ville = valuesiter.next();
			System.out.println(">"+ville.getNom()+" "+ville.getNbHabitants());//=OK
		}
		//
	}//fin main()

}//fin Classe()
