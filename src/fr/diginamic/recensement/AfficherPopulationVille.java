package fr.diginamic.recensement;

import java.util.Iterator;
import java.util.Scanner;

public class AfficherPopulationVille extends MenuService{
	//
	private Ville ville;//attribut
	private Scanner scanner;
	//
	public AfficherPopulationVille() {
		this.ville = null;
		this.scanner = new Scanner(System.in);//flux fermé en sortie de boucle principale
		System.out.println("cons populationville");//OK
	}//fin constructeur()

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		//scanner = new Scanner(System.in);
		System.out.println("Saisir le nom de la ville: \n(Pour Lyon spécifier l'arrondissment.(ex: Lyon 1er Arrondissement)");
		String nomVille = scanner.nextLine();
		//
		//**System.out.println("Vous avez entré: "+nomVille);
		//System.out.println("->"+recensement.toString());=OK
		Iterator<String> iterVille = recensement.getListe().iterator();
		iterVille.next();//pour passer la premiere ligne du document=entete
		
		while(iterVille.hasNext()){
			ville = new Ville();
			String ligneLue = iterVille.next();
			String[] tokens = ligneLue.split(";");//0,1,2,5,6,7
			ville.setCodeRegion(Integer.parseInt(tokens[0].toString()));//int
			ville.setNomRegion(tokens[1].toString());//String
			ville.setCodeDepartement(tokens[2].toString());//int-> Corse = 2A
			ville.setCodeCommune(Integer.parseInt(tokens[5].toString()));//int
			ville.setNomCommune(tokens[6].toString());//String 
			tokens[9] = tokens[9].toString().replace(" ","");
			ville.setPopulationTotale(Integer.parseInt(tokens[9].toString()));//int!! espace
			if(ville.getNomCommune().equals(nomVille)==true) {
				System.out.println("Retrouvé: "+ville.toString());//verifier sans sSystem.out.println(-retour ligne
				
			}
		}
		//scanner.close();
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

}
