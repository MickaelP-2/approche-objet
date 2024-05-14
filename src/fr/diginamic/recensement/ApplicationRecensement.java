package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import AfficherPopulationVille ;


public class ApplicationRecensement {
//Path origine =  Paths.get("C:/Users/Utilisateur/Documents//GIT-UX//12. Java approche objet/TP/recensement.csv");
//Entete:Code	*région;Nom	*de	la	région;Code	*département;Code	arrondissement;Code	canton;Code*	commune;Nom	de*	la	commune;Population	municipale;Population	comptée	ￃﾠ	part;Population	*totale;
	static AfficherPopulationVille afficherPopulationVille;
	static AfficherPopulationDepartement afficherPopulationDepartement;
	static AfficherPopulationRegion afficherPopulationRegion;
	static Afficher10Region afficher10Region;
	static Afficher10Departement afficher10Departement;
	static Afficher10VillesDepartement afficher10VillesDepartement;
	static Afficher10VillesRegion afficher10VillesRegion;
	static Afficher10VillesFrancaise afficher10VillesFrance;
	static Recensement recensement;
	static Scanner scanner;
	//
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//10 requetes:
		//1: population d'une ville donnée-> saisie du nom+verif si existant
		//2: population d'un département donné-> saisie nom departement + verif + calcul population departement
		//3: population d'une région donnée -> Saisie nom+verfi+calcul population region 
		//4: afficher les 10 region les plus peuplées -> saisie de nom région+verif+calcul
		//5: afficher les 10 départements les plus peuplés -> saisie de nom département+verif+calcul
		//6: afficher les 10 villes les plus peuplées d'un département  -> saisie du nom departement + verif +calcul
		//7: afficher les 10 villes les plus peuplées d'une région
		//8: afficher les 10 villes les plus peuplées de France
		//9: Retour accueil/Sortir
		List<String> list = new ArrayList<>();
		Path origine =  Paths.get("C:/Users/Utilisateur/Documents//workspace-spring-tool-suite-4-4.22.0.RELEASE2/approche_objet/recensement.csv");
		//**Path destination = Paths.get("C://Users//Utilisateur//Documents//workspace-spring-tool-suite-4-4.22.0.RELEASE2//approche_objet//CopyRecensement2.txt");
		//Vérification du fichier source(origine)
		if(Files.exists(origine)==false) {
			System.out.println("Fichier source non trouvé!!");
			return;
		}
		else if(Files.exists(origine)==true) {
			System.out.println("Fichier source trouvé!!");
		}
		boolean isend = false;
		while(isend!=true) {
			System.out.println("****************************************************************************\n* Choisir une action:                                                      *\n* Pour afficher la population d'une ville:                               1 *\n* Pour afficher la population d'un département:                          2 *\n* Pour la population d'une région:                                       3 *\n* Pour afficher les 10 régions les plus peuplées:                        4 *\n* Pour afficher les 10 départements les plus peuplés:                    5 *\n* Afficher les 10 villes les plus peuplées d'un département:             6 *\n* Afficher les 10 villes les plus peuplées d'une région:                 7 *\n* Pour afficher les 10 villes les plus peuplées de France:               8 *\n* Pour quitter:                                                          9 *\n****************************************************************************");
			list = Files.readAllLines(origine,StandardCharsets.UTF_8);//accents ok console
			scanner = new Scanner(System.in);//ouverture du flux de lecture
			int choix_utilisateur = scanner.nextInt();
			switch (choix_utilisateur){
			case 1:{
				//population d'une ville donnée
				System.out.println("population d'une ville donnée");
				afficherPopulationVille = new AfficherPopulationVille();
				afficherPopulationVille.traiter(recensement = new Recensement(), afficherPopulationVille.getScanner());
			}
			break;
			case 2:{
				//population d'un département donné
				System.out.println("population d'un département donnée");
				afficherPopulationDepartement = new AfficherPopulationDepartement();
				afficherPopulationDepartement.traiter(recensement = new Recensement(), afficherPopulationDepartement.getScanner());
			}
			break;
			case 3:{
				//population d'une région donnée
				System.out.println("population d'une région donnée");
				afficherPopulationRegion = new AfficherPopulationRegion();
				afficherPopulationRegion.traiter(recensement = new Recensement(), afficherPopulationRegion.getScanner());
			}
			break;
			case 4:{
				//afficher les 10 régions le plus peuplées
				System.out.println("population des 10 régions les plus peuplées");
				afficher10Region = new Afficher10Region();
				afficher10Region.traiter(recensement = new Recensement(), afficher10Region.getScanner());
			}
			break;
			case 5:{
				//afficher les 10 départements les plus peuplés
				System.out.println("population des 10 départements les plus peuplés");
				afficher10Departement = new Afficher10Departement();
				afficher10Departement.traiter(recensement = new Recensement(), afficher10Departement.getScanner());
			}
			break;
			case 6:{
				//afficher les 10 villes les plus peuplées d'un département donné
				System.out.println("population des 10 ville les plus peuplées");
				afficher10VillesDepartement = new Afficher10VillesDepartement();
				afficher10VillesDepartement.traiter(recensement = new Recensement(), afficher10VillesDepartement.getScanner());
			}
			break;
			case 7:{
				//afficher les 10 villes les plus peuplées d'une région donnée
				System.out.println("population des 10  villes les plus peuplées d'une région donnée");
				afficher10VillesRegion = new Afficher10VillesRegion();
				afficher10VillesRegion.traiter(recensement = new Recensement(), afficher10VillesRegion.getScanner());
			}
			break;
			case 8:{
				//afficher les 10 villes les plus peuplées de France
				System.out.println("population 10 villes les plus peuplées de France");
				afficher10VillesFrance = new Afficher10VillesFrancaise();
				afficher10VillesFrance.traiter(recensement = new Recensement(), afficher10VillesFrance.getScanner());
			}
			break;
			case 9:{
				//Quitter
				isend = true;
				System.out.println("Au revoir!!");
			}
			break;
			default:{
				//Cas de choix non reconnu ou traité
				System.out.println("Choix non traité!!");
			}
			break;
			}
		//
			//scanner.close();//fermeture du flux de lecture
		}//fin while(boucle avec condition de sortie
		scanner.close();
		/*
		Iterator<String> iterator = list.iterator();
		//*****String entete = iterator.next();//Pour passer la premiere ligne(entete)
		while(iterator.hasNext()) {
			//1 ville a chaque ligne
			String ligne = iterator.next();
			System.out.println("ligne: "+ligne);
			Files.writeString(destination, (ligne+"\n"),StandardOpenOption.APPEND);
		}//fin while)
		*/
		
	}//fin main()

}//fin Classe()
