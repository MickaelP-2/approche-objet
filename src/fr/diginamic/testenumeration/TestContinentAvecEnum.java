package fr.diginamic.testenumeration;


import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-geArrayList<E>ethod stub
		ArrayList<Ville> villes = new ArrayList<Ville>();
		villes.add(new Ville("New York",8300000,Continents.AMERIQUE));
		villes.add(new Ville("Paris", 2100000,Continents.EUROPE));
		villes.add(new Ville("Pékin", 100000000,Continents.ASIE));
		villes.add(new Ville("Moscou",1000000,Continents.EUROPE));
		villes.add(new Ville("Berlin",1100000,Continents.EUROPE));
		villes.add(new Ville("Sydney",975000,Continents.OCEANIE));
		villes.add(new Ville("Sao Paulo",2000000,Continents.AMERIQUE));
		villes.add(new Ville("Dakar",375000,Continents.AFRIQUE));
		for(Ville ville : villes) {
			System.out.println(ville.toString());
		}
	}

}
