package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
		HashMap<String, Departement> listDepartement2 = new HashMap<String, Departement>();//pour les traitemnts
		Iterator<String> iter = recensement.getListe().iterator();
		iter.next();//pour passer la premiere ligne du document=entete
		Departement departement = new Departement();//pour utiliser la premiere valeur pour initialiser une region
		String cle = null;
		String [] tokens = null;
		int population = 0;
		int popdep = 0;//Pour la population du département
		int nbdep =0;
		while(iter.hasNext()){
			Departement departement2 = new Departement();//pour les regions
			String ligneLue = iter.next();
			tokens = ligneLue.split(";");//???
			departement2.setCodeRegion(tokens[0].toString());//String
			departement2.setNomRegion(tokens[1].toString());//String
			departement2.setCodeDepartement(tokens[2].toString());//String
			departement2.setNomDepartement(departement2.CodeNomDepartement(tokens[2].toString()));//String
			cle = departement2.getNomDepartement();
			tokens[9] = tokens[9].trim().replace(" ","");
			departement2.setPopulation(Integer.parseInt(tokens[9].toString()));//int!! espace
			if(listDepartement2.toString().contains(departement2.getNomDepartement())==false) {
				listDepartement2.put(cle, departement2);//OK
				population = 0;//remet la valeur population a 0
				popdep=0;
			}
			if(listDepartement2.toString().contains(departement2.getNomDepartement())==true) {
				population = population+(Integer.parseInt(tokens[9].toString()));
				departement2.setPopulation(population);
				listDepartement2.put(cle, departement2);//OK
				population = departement2.getPopulation();
				popdep = popdep+(Integer.parseInt(tokens[9].toString()));
			}
		}
		String cle_lue=null;
		Departement valeur_lue = null;
		Iterator<String> keyiter = listDepartement2.keySet().iterator();
		Iterator<Departement> valuesiter = listDepartement2.values().iterator();
		while(keyiter.hasNext() && valuesiter.hasNext()) {
			cle_lue = keyiter.next();
			valeur_lue = valuesiter.next();
			listDepartement.add(valeur_lue);
		}
		//affichage de la liste triée
		Collections.sort(listDepartement, new Departement());//tri de la liste des villes de la région
		int nb=0;
		System.out.println("Les 10 départements les plus peuplées: ");
		Iterator<Departement> iterDepartement = listDepartement.iterator();
		while(iterDepartement.hasNext() && nb<10) {//&& nb<10
			departement = iterDepartement.next();
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
