package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Afficher10VillesDepartement extends MenuService {
	private Ville ville;//attribut
	private Departement departement;
	private Scanner scanner;
	//
	public Afficher10VillesDepartement() {
		this.ville = null;
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
		System.out.println("Saisir le nom du département: ");
		String nomdepartement = scanner.nextLine();
		//
		//System.out.println("Vous avez entré: "+nomderegion);
		System.out.println("->"+recensement.toString());//=OK
		List<Ville> listVille = new ArrayList<>();//Pour utiliser uen liste de villes de la région
		Iterator<String> iterDepartement = recensement.getListe().iterator();
		iterDepartement.next();//pour passer la premiere ligne du document=entete
		
		while(iterDepartement.hasNext()){
			departement = new Departement();//pour les regions
			ville = new Ville();//pour les différentes villes
			String ligneLue = iterDepartement.next();
			String[] tokens = ligneLue.split(";");//???
			departement.setCodeRegion(tokens[0].toString());//String
			departement.setNomRegion(tokens[1].toString());//String
			departement.setCodeDepartement(tokens[2].toString());
			ville.setNomCommune(tokens[6].toString());
			ville.setCodeCommune(Integer.parseInt(tokens[5].toString()));
			ville.setCodeDepartement(tokens[2].toString());
			ville.setCodeRegion(Integer.parseInt(tokens[0].toString()));
			ville.setNomRegion(tokens[1].toString());
			tokens[9] = tokens[9].toString().replace(" ","");
			ville.setPopulationTotale(Integer.parseInt(tokens[9].toString()));//String
			departement.setPopulation(Integer.parseInt(tokens[9].toString()));//int!! espace
			//System.out.println("departement: "+departement.getCodeDepartement()+" nomdep: "+departement.CorrespondanceNomCodeDepartement(nomdepartement));
			if(departement.getCodeDepartement().equals(departement.NomCodeDepartement(nomdepartement))==true) {
				listVille.add(ville);
			}//fin if()
		}
		Collections.sort(listVille, new Ville());//tri de la liste des villes de la région
		int nb=0;
		System.out.println("Les 10 villes les plus peuplées du département: "+nomdepartement+" "+listVille.size());
		Iterator<Ville> iterVille = listVille.iterator();
		while(iterVille.hasNext() && nb<10) {
			Ville ville = iterVille.next();
			System.out.println((nb+1)+">"+ville);
			nb++;
		}
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
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
		return "Afficher10VillesDepartement [ville=" + ville + ", departement=" + departement + ", scanner=" + scanner
				+ "]";
	}

}
