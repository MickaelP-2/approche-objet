package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Afficher10Departement  extends MenuService{
	private Departement departement;
	private Scanner scanner;
	//
	public Afficher10Departement() {
		this.departement = null;
		this.scanner = new Scanner(System.in);//flux fermé en sortie de boucle principale
		System.out.println("cons populationville");//OK
	}//fin constructeur()
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		List<Departement> listDepartement = new ArrayList<>();//Pour utiliser une liste de villes de la région
		Iterator<String> iter = recensement.getListe().iterator();
		iter.next();//pour passer la premiere ligne du document=entete
		Departement departement1 = new Departement();//pour utiliser la premiere valeur pour initialiser une region
		String str = iter.next();//pour utiliser des premieres valeurs
		System.out.println("str: "+str);
		String[] tokens = str.split(";");//???
			departement1.setCodeRegion(tokens[0].toString());//String
			departement1.setNomRegion(tokens[1].toString());//String
			departement1.setCodeDepartement(tokens[2].toString());//String
			//departement1.setNomDepartement(departement.CorrespondanceCodeNomDepartement(tokens[2]));//String
			tokens[9] = tokens[9].trim().replace(" ","");
			departement1.setPopulation(Integer.parseInt(tokens[9].toString()));//int!! espace
			listDepartement.add(departement1);
			int population = 0;
			//*System.out.println("nom region1: "+region1.getCodeRegion());
		while(iter.hasNext()){
			departement = new Departement();//pour les regions
			String ligneLue = iter.next();
			tokens = ligneLue.split(";");//???
			departement.setCodeRegion(tokens[0].toString());//String
			departement.setNomRegion(tokens[1].toString());//String
			departement.setCodeDepartement(tokens[2].toString());//String
			//departement.setNomDepartement(departement.CorrespondanceNomCodeDepartement(tokens[2].toString()));//String
			tokens[9] = tokens[9].trim().replace(" ","");
			departement.setPopulation(Integer.parseInt(tokens[9].toString()));//int!! espace
			//*System.out.println("lignelue: "+ligneLue);
			if(departement.getCodeDepartement().equals(departement1.getCodeDepartement())==false) {
				//*System.out.println("lignelue: "+ligneLue);
				//departement1.setNomDepartement(departement.getNomDepartement());//Pour passer a un autre nom de region
				population = departement.getPopulation();
				listDepartement.add(departement);	
			}//fin if()
			if(departement.getCodeDepartement().equals(departement1.getCodeDepartement())==true) {
				//System.out.println("lignelue: "+ligneLue);
				population = population+departement.getPopulation();
				departement1.setPopulation(population);//Pour passer a un autre nom de region
				//listRegion.add(region);	
			}//fin if()
		}
		System.out.println("nb reg: "+listDepartement.size());
		Collections.sort(listDepartement, new Departement());//tri de la liste des villes de la région
		int nb=0;
		System.out.println("Les 10 départements les plus peuplées: ");
		Iterator<Departement> iterDepartement = listDepartement.iterator();
		while(iterDepartement.hasNext() && nb<10) {//&& nb<10
			Departement departement = iterDepartement.next();
			System.out.println((nb+1)+">"+departement);
			nb++;
		}
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	@Override
	public String toString() {
		return "Afficher10Departement [departement=" + departement + ", scanner=" + scanner + "]";
	}

}
