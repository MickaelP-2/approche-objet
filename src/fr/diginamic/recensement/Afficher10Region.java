package fr.diginamic.recensement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import maps.Villes;

public class Afficher10Region  extends MenuService{
	private Region region;
	private Scanner scanner;
	//
	public Afficher10Region() {
		this.region = null;
		this.scanner = new Scanner(System.in);//flux fermé en sortie de boucle principale
		System.out.println("cons populationville");//OK
	}//fin constructeur()
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		ArrayList<Region> listRegion = new ArrayList<>();//Pour utiliser une liste de région pour le tri
		HashMap<String, Region> listRegion2 = new HashMap<String, Region>();//pour les traitemnts
		Iterator<String> iter = recensement.getListe().iterator();
		iter.next();//pour passer la premiere ligne du document=entete
		Region region = new Region();//pour utiliser la premiere valeur pour initialiser une region
		String [] tokens = null;
		String cle = null;
		int population = 0;
		int popfra = 0;
		while(iter.hasNext()){
			Region region2 = new Region();//pour les regions:code region, nom region,population
			String ligneLue = iter.next();
			tokens = ligneLue.split(";");//???
			region2.setCodeRegion(tokens[0].toString());//String
			region2.setNomRegion(tokens[1].toString());//String
			cle = region2.getNomRegion();
			tokens[9] = tokens[9].trim().replace(" ","");
			region2.setPopulationTotale(Integer.parseInt(tokens[9].toString()));//int!! espace
			if(listRegion2.toString().contains(region2.getNomRegion())==false) {
				listRegion2.put(cle, region2);//OK
				population = 0;//remet la valeur population a 0
			}
			if(listRegion2.toString().contains(region2.getNomRegion())==true) {
				population = population+(Integer.parseInt(tokens[9].toString()));
				region2.setPopulationTotale(population);
				listRegion2.put(cle, region2);//OK
				population = region2.getPopulationTotale();
				popfra = popfra+(Integer.parseInt(tokens[9].toString()));
			}
		}//fin while()
		String cle_lue=null;
		Region valeur_lue = null;
		Iterator<String> keyiter = listRegion2.keySet().iterator();
		Iterator<Region> valuesiter = listRegion2.values().iterator();
		System.out.println("Population totale du pays: "+popfra);
		//lecture de la map listRegion2 et copier le svaleurs dans l'ArrayList
		while(keyiter.hasNext() && valuesiter.hasNext()) {
			cle_lue = keyiter.next();
			valeur_lue = valuesiter.next();
			//System.out.println("cle: "+cle_lue+" val: "+valeur_lue);
			listRegion.add(valeur_lue);
		}
		//tri de la liste des villes de la région avec comparator de classe Region
		Collections.sort(listRegion, new Region());
		int nb=0;
		System.out.println("Les 10 régions les plus peuplées: ");
		Iterator<Region> iterRegion = listRegion.iterator();
		while(iterRegion.hasNext() && nb<10) {//&& nb<10
			region = iterRegion.next();
			System.out.println((nb+1)+">"+region);
			nb++;
		}
		
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	/*
	@Override
	public String toString() {
		return "Afficher10Region [region=" + region + ", scanner=" + scanner + "]";
	}
	*/
}
