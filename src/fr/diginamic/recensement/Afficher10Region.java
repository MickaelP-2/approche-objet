package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
		List<Region> listRegion = new ArrayList<>();//Pour utiliser une liste de villes de la région
		Iterator<String> iter = recensement.getListe().iterator();
		iter.next();//pour passer la premiere ligne du document=entete
		Region region1 = new Region();//pour utiliser la premiere valeur pour initialiser une region
		String str = iter.next();//pour utiliser des premieres valeurs
		System.out.println("str: "+str);
		String[] tokens = str.split(";");//???
			region1.setCodeRegion(tokens[0].toString());//String
			region1.setNomRegion(tokens[1].toString());//String
			region1.setPopulationTotale(Integer.parseInt(tokens[9].toString()));//int!! espace
			listRegion.add(region1);
			int population = 0;
			//*System.out.println("nom region1: "+region1.getCodeRegion());
		while(iter.hasNext()){
			region = new Region();//pour les regions
			String ligneLue = iter.next();
			tokens = ligneLue.split(";");//???
			region.setCodeRegion(tokens[0].toString());//String
			region.setNomRegion(tokens[1].toString());//String
			tokens[9] = tokens[9].trim().replace(" ","");
			region.setPopulationTotale(Integer.parseInt(tokens[9].toString()));//int!! espace
			//*System.out.println("lignelue: "+ligneLue);
			if(region.getNomRegion().equals(region1.getNomRegion())==false) {
				System.out.println("lignelue: "+ligneLue);
				region1.setNomRegion(region.getNomRegion());//Pour passer a un autre nom de region
				population = region.getPopulationTotale();
				listRegion.add(region);	
			}//fin if()
			if(region.getNomRegion().equals(region1.getNomRegion())==true) {
				System.out.println("lignelue: "+ligneLue);
				population = population+region.getPopulationTotale();
				region1.setPopulationTotale(population);//Pour passer a un autre nom de region
				//listRegion.add(region);	
			}//fin if()
		}
		System.out.println("nb reg: "+listRegion.size());
		Collections.sort(listRegion, new Region());//tri de la liste des villes de la région
		int nb=0;
		System.out.println("Les 10 régions les plus peuplées: ");
		Iterator<Region> iterRegion = listRegion.iterator();
		while(iterRegion.hasNext()) {//&& nb<10
			Region region = iterRegion.next();
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
	@Override
	public String toString() {
		return "Afficher10Region [region=" + region + ", scanner=" + scanner + "]";
	}

}
