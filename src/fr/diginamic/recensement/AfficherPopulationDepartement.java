package fr.diginamic.recensement;

import java.util.Iterator;
import java.util.Scanner;

public class AfficherPopulationDepartement  extends MenuService{
//
	//private Ville ville;//attribut
	private Departement departement;//
	private Scanner scanner;
	//
	public AfficherPopulationDepartement() {
		this.departement = null;
		this.scanner = new Scanner(System.in);//flux fermé en sortie de boucle principale
		System.out.println("cons populationdep");//OK
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
		//**System.out.println("Vous avez entré: "+nomdepartement);
		//System.out.println("->"+recensement.toString());//=OK
		int populationDep = 0;
		Iterator<String> iterDepartement = recensement.getListe().iterator();
		iterDepartement.next();//pour passer la premiere ligne du document=entete
		
		while(iterDepartement.hasNext()){
			departement = new Departement();
			String ligneLue = iterDepartement.next();
			String[] tokens = ligneLue.split(";");//???
			departement.setCodeDepartement(tokens[2].toString());//String
			departement.setNomDepartement(departement.CorrespondanceNomCodeDepartement(tokens[2].toString()));//String
			departement.setCodeRegion(tokens[0].toString());//String-> Corse = 2A
			departement.setNomRegion(tokens[1].toString());//String
			tokens[9] = tokens[9].toString().replace(" ","");
			departement.setPopulation(Integer.parseInt(tokens[9].toString()));//int!! espace
			if(departement.getCodeDepartement().equals(departement.CorrespondanceNomCodeDepartement(nomdepartement))==true) {
				populationDep = populationDep+departement.getPopulation();	
			}//fin if()
		}
		System.out.println("Le département: "+nomdepartement +"\n à une population de: "+populationDep+" habitants.");
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
		return "Afficherla populationdu département: [departement=" + departement + ", scanner=" + scanner + "]";
	}

}
