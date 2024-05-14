package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Afficher10VillesFrancaise extends MenuService {
	private Ville ville;//attribut
	private Region region;
	private Scanner scanner;
	//
	public Afficher10VillesFrancaise() {
		this.ville = null;
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
		List<Ville> listVille = new ArrayList<>();//Pour utiliser uen liste de villes de la région
		Iterator<String> iterRegion = recensement.getListe().iterator();
		iterRegion.next();//pour passer la premiere ligne du document=entete
		
		while(iterRegion.hasNext()){
			region = new Region();//pour les regions
			ville = new Ville();//pour les différentes villes
			String ligneLue = iterRegion.next();
			String[] tokens = ligneLue.split(";");//???
			region.setCodeRegion(tokens[0].toString());//String
			region.setNomRegion(tokens[1].toString());//String
			ville.setNomCommune(tokens[6].toString());
			ville.setCodeCommune(Integer.parseInt(tokens[5].toString()));
			ville.setCodeDepartement(tokens[2].toString());
			ville.setCodeRegion(Integer.parseInt(tokens[0].toString()));
			ville.setNomRegion(tokens[1].toString());
			tokens[9] = tokens[9].toString().replace(" ","");
			ville.setPopulationTotale(Integer.parseInt(tokens[9].toString()));//String
			region.setPopulationTotale(Integer.parseInt(tokens[9].toString()));//int!! espace
			listVille.add(ville);	
		}
		Collections.sort(listVille, new Ville());//tri de la liste ds viles de la région
		int nb=0;
		System.out.println("Les 10 villes les plus peuplées de France: ");
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
		return "Afficher10VillesFrancaise [ville=" + ville + ", region=" + region + ", scanner=" + scanner + "]";
	}

}
