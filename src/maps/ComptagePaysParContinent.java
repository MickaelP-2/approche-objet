package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//créer une arrayList contenant les pays suivants
		/*
		  France, 65 millions d’habitants, Europe
		  Allemagne, 80 millions d’habitants, Europe
		  Belgique, 10 millions d’habitants, Europe
		  Russie, 150 millions d’habitants, Asie
		  Chine, 1.4 milliards d’habitants, Asie
		  Indonésie, 220 millions d’habitants, Océanie,
		  Australie, 20 millions d’habitants, Océanie
		*/
		Pays pays1 = new Pays("France",65000000,"Europe");
		Pays pays2 = new Pays("Allemagne",80000000,"Europe");
		Pays pays3 = new Pays("Belgique",10000000,"Europe");
		Pays pays4 = new Pays("Russie",150000000,"Asie");
		Pays pays5 = new Pays("Chine",1400000000,"Asie");
		Pays pays6 = new Pays("Indonesie",220000000,"Océanie");
		Pays pays7 = new Pays("Australie",20000000,"Océanie");
		/*
		 * En commentaires la version 1 -> J'ai utilisée l'arrayList pour faire les traitements
		ArrayList<Pays> list = new ArrayList<Pays>();
		list.add(pays1);
		list.add(pays2);
		list.add(pays3);
		list.add(pays4);
		list.add(pays5);
		list.add(pays6);
		list.add(pays7);
		//
		*/
		//en clair le code utilisant uniquement la map
		HashMap<String, Pays> map = new HashMap<String, Pays>();
		map.put("pays1",pays1);
		map.put("pays2",pays2);
		map.put("pays3",pays3);
		map.put("pays4",pays4);
		map.put("pays5",pays5);
		map.put("pays6",pays6);
		map.put("pays7",pays7);
		
		//lire la ArrayList et copier dans map en fonction des continents
		int nbEurope=0,nbAsie=0,nbAfrique=0,nbOceanie=0,nbAmerique=0;
		/*
		 * En commentaires la version 1 -> J'ai utilisée l'arrayList pour faire les traitements
		Iterator<String, Pays> iter = map.iterator();
		while(iter.hasNext()) {
			Pays pays = iter.next();
			//System.out.println("pays: "+pays.toString());
			//System.out.println("nom: "+pays.getNom()+" continent: "+pays.getContinent());
			if(pays.getContinent().equals("Europe")) {
				nbEurope++;
			}
			if(pays.getContinent().equals("Asie")) {
				nbAsie++;
			}
			if(pays.getContinent().equals("Afrique")) {
				nbAfrique++;
			}
			if(pays.getContinent().equals("Océanie")) {
				nbOceanie++;
			}
			if(pays.getContinent().equals("Amérique")) {
				nbAmerique++;
			}			
		}
		*/
		Iterator<Pays> valuesIter = map.values().iterator();
		while(valuesIter.hasNext()) {
			Pays pays = valuesIter.next();
			if(pays.getContinent().equals("Asie")==true) {
				nbAsie++;
			}
			if(pays.getContinent().equals("Afrique")==true) {
				nbAfrique++;
			}
			if(pays.getContinent().equals("Amerique")==true) {
				nbAmerique++;
			}
			if(pays.getContinent().equals("Europe")==true) {
				nbEurope++;
			}
			if(pays.getContinent().equals("Océanie")==true) {
				nbOceanie++;
			}
		}
		/*
		 * En commentaires la version 1 -> J'ai utilisée l'arrayList pour faire les traitements
		map.put("Europe",nbEurope);
		map.put("Asie",nbAsie);
		map.put("Afrique",nbAfrique);
		map.put("Oceanie",nbOceanie);
		map.put("Amerique",nbAmerique);
		
		//
		String cle_lue = null;
		int nb_lu = 0;
		Iterator<String> keyiter = map.keySet().iterator();
		Iterator<Integer> valuesiter = map.values().iterator();
		while(keyiter.hasNext() && valuesiter.hasNext()) {
			cle_lue = keyiter.next();//pour la cle=continent
			nb_lu = valuesiter.next();//pour la valeur-> nb_pays
			System.out.println(">"+cle_lue+" "+nb_lu);//=OK
		}
		*/
		System.out.println("Continent Afrique: "+nbAfrique+" pays.");
		System.out.println("Continent Asie: "+nbAsie+" pays.");
		System.out.println("Continent Amérique: "+nbAmerique+" pays.");
		System.out.println("Continent Europe: "+nbEurope+" pays.");
		System.out.println("Continent océanie: "+nbOceanie+" pays.");
	}//fin main()

}//Fn classe()
