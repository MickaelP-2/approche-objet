package essais;

import java.util.Scanner;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.SalledeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.Maison;

//
public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison maison = null;
		int choix = 0, selection=0;//choix de l'utilisateur, selction de la piece
		double superficie = 0.0;//pour la superficie de la piece
		int etage = 0;//pour l"etage
		boolean fin = false;//pour arreter le programme
		while (fin!=true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("*********************************************"+"\n* Construire une maison:                  1 *"+"\n* afficher la superficie totale:          2 *\n* afficher la surface d'un étage:         3 *\n* afficher la surface d'un type de pièce: 4 *\n* afficher le nombre d'un type de pièce:  5 *\n* Pour quitter:                           6 *\n*********************************************");
			choix = scan.nextInt();
			switch (choix){
			case 1:{
				maison = new Maison();
				boolean arret = false;//Pour sortir de la boucle de saisie
				while(arret!=true) {
					System.out.println("Ajouter une pièce: ");
					System.out.println("Pour une chambre:       1 ");
					System.out.println("Pour une cuisine:       2 ");
					System.out.println("Pour une salle de bain: 3 ");
					System.out.println("Pour un salon:          4 ");
					System.out.println("Pour un wc:             5 ");
					System.out.println("Pour arreter la saisie: 6 ");
					selection = scan.nextInt();
					switch(selection) {
						case 1:{
							System.out.println("superficie?: ");
							superficie = scan.nextDouble();
							System.out.println("étage?: ");
							etage = scan.nextInt();
							Chambre chambre = new Chambre(superficie,etage);
							maison.ajouterPiece(chambre);
						}
						break;
						case 2:{
							System.out.println("superficie?: ");
							superficie = scan.nextDouble();
							System.out.println("étage?: ");
							etage = scan.nextInt();
							Cuisine cuisine = new Cuisine(superficie,etage);
							maison.ajouterPiece(cuisine);
						}
						break;
						case 3:{
							System.out.println("superficie?: ");
							superficie = scan.nextDouble();
							System.out.println("étage?: ");
							etage = scan.nextInt();
							SalledeBain salledebain = new SalledeBain(superficie,etage);
							maison.ajouterPiece(salledebain);
						}
						break;
						case 4:{
							System.out.println("superficie?: ");
							superficie = scan.nextDouble();
							System.out.println("étage?: ");
							etage = scan.nextInt();
							Salon salon = new Salon(superficie,etage);
							maison.ajouterPiece(salon);
						}
						break;
						case 5:{
							System.out.println("superficie?: ");
							superficie = scan.nextDouble();
							System.out.println("étage?: ");
							etage = scan.nextInt();
							WC wc = new WC(superficie,etage);
							maison.ajouterPiece(wc);
						}
						break;
						case 6:{
							arret = true;
						}
						break;
						default:{
							System.out.println(" Erreur de saisie!");
						}
						break;
					}//fin switch(selection)
				}//fin while()
			}
			break;
			case 2:{
				if(maison==null) {
					System.out.println("Créer une maison avant.");
					break;
				}
				else {
					System.out.println("Superficie: "+maison.superficieTotale()+" m²");
				}
			}
			break;
			case 3:{
				if(maison==null) {
					System.out.println("Créer une maison avant.");
				}
				else {
					int numEtage = 0; 
					System.out.println("Saisir le numéro d'étage: ");
					numEtage = scan.nextInt();
					System.out.println("Superficie de l'étage: "+maison.superficieEtage(numEtage)+" m²");
				}
			}
			break;
			case 4:{
				if(maison==null) {
					System.out.println("Créer une maison avant.");
				}
				else {
					System.out.println(" Pour chambres: 1\n Pour cuisine: 2\n Pour Salle de bain: 3\n Pour salon: 4\n Pour WC: 5");
					selection = scan.nextInt();
					Piece piece = null;
					if(selection==1) {
						piece = new Chambre(0.0,0);
					}
					if(selection==2) {
						piece = new Cuisine(0.0,0);
					}
					if(selection==3) {
						piece = new SalledeBain(0.0,0);
					}
					if(selection==4) {
						piece = new Salon(0.0,0);
					}
					if(selection==5) {
						piece = new WC(0.0,0);
					}
					System.out.println("Superficie globale: "+maison.surfaceGlobale(piece));
				}
			}
			break;
			case 5:{
				if(maison==null) {
					System.out.println("Créer une maison avant.");
				}
				else {
					System.out.println(" Pour chambres: 1\n Pour cuisine: 2\n Pour Salle de bain: 3\n Pour salon: 4\n Pour WC: 5");
					selection = scan.nextInt();
					Piece piece = null;
					if(selection==1) {
						piece = new Chambre(0.0,0);
					}
					if(selection==2) {
						piece = new Cuisine(0.0,0);
					}
					if(selection==3) {
						piece = new SalledeBain(0.0,0);
					}
					if(selection==4) {
						piece = new Salon(0.0,0);
					}
					if(selection==5) {
						piece = new WC(0.0,0);
					}
					System.out.println("Nombre: "+maison.nombreGlobal(piece));
				}
					
			}
			break;
			case 6:{
				fin = true;
			}
			break;
			default:{
				System.out.println("Choix inconnu!");
			}
			break;
			}//fin switch
			/*
			Maison maison = new Maison();
			Chambre chambre = new Chambre(25,0);
			maison.ajouterPiece(chambre);
			WC wc = new WC(10,0);
			maison.ajouterPiece(wc);
			Cuisine cuis = new Cuisine(10,0);
			maison.ajouterPiece(cuis);
			Chambre chambre2 = new Chambre(15,0);
			maison.ajouterPiece(chambre2);
			//maison.ajouterPiece(null);//structure conditionnelle dans Maison
			System.out.println("Superficie: "+maison.superficieTotale()+" m²");//=OK
			System.out.println("Superficie de l'étage: "+maison.superficieEtage(0)+" m²");//=OK
			System.out.println("Superficie globale: "+maison.surfaceGlobale(chambre));
			System.out.println("Nombre: "+maison.nombreGlobal(wc));
			*/
			scan.close();
			}//fin programme()
		System.out.println("Au revoir!!");
	}//fin main()
//
}//Fin classe TestMaison()
