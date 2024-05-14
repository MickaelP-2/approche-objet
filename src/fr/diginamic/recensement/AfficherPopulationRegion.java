package fr.diginamic.recensement;

import java.util.Iterator;
import java.util.Scanner;

public class AfficherPopulationRegion  extends MenuService{
	private Region region;//attribut
	private Scanner scanner;
	//
	public AfficherPopulationRegion() {
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
		System.out.println("Saisir le nom de la région: ");
		String nomderegion = scanner.nextLine();
		//
		//System.out.println("Vous avez entré: "+nomderegion);
		//System.out.println("->"+recensement.toString());//=OK
		int populationRegion = 0;
		Iterator<String> iterRegion = recensement.getListe().iterator();
		iterRegion.next();//pour passer la premiere ligne du document=entete
		
		while(iterRegion.hasNext()){
			region = new Region();
			String ligneLue = iterRegion.next();
			String[] tokens = ligneLue.split(";");//???
			region.setCodeRegion(tokens[0].toString());//String
			region.setNomRegion(tokens[1].toString());//String
			tokens[9] = tokens[9].toString().replace(" ","");
			region.setPopulationTotale(Integer.parseInt(tokens[9].toString()));//int!! espace
			if(region.getNomRegion().equals(nomderegion)==true) {
				populationRegion = populationRegion+region.getPopulationTotale();	
			}//fin if()
		}
		System.out.println("La: "+nomderegion +"\n à une population de: "+populationRegion+" habitants.");
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
		return "AfficherPopulationRegion [region=" + region + ", scanner=" + scanner + "]";
	}

}
