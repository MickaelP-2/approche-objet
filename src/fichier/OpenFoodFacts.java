package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class OpenFoodFacts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Compter le nombre de produits par par marque et par catégorie
		//generer un fichier avec les resultats
		//telecharger le fichier recencement.csv
		Path origine =  Paths.get("C:/Users/Utilisateur/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE2/open-food-facts.csv");
		Path destination = Paths.get("C:/Users/Utilisateur/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE2/approche_objet/bin/fichier/CopyOpenFoodFacts.txt");
		//test existence
		System.out.println("Ressource éxistante:  "+Files.exists(origine));
		System.out.println("fichier regulier: "+Files.isRegularFile(origine));
		//Files.isRegularDirectory(origine)-> pour un repertoire
		System.out.println("Lisible: "+Files.isReadable(origine));
		if(Files.exists(origine)==false) {
			System.out.println("origine inconnue!!");
		}
		if(Files.exists(destination)==false) {
			//Création du fichier des destination si non existant
			Files.createFile(destination);
			System.out.println("destination créée!!");
		}
		
		System.out.println("-"+Files.readAllLines(origine));
		List<String> lines = Files.readAllLines(origine, StandardCharsets.UTF_8);
		//Affichage des lignes du fichier
		System.out.println("lines: "+lines.size());
		Object[] tab = lines.toArray();//limites du type int??
		int nb_categorie = 0;
		int nb_marque = 0;
		String nom_marque = null;
		String nom_categorie = null;
		
		for(int i=0;i<15;i++) {//tab.length
			
			if(i>=1) {
				//traitement apres ligne0
				System.out.println("*"+i+" "+tab[i].toString());//OK pour l'affichage des lignes
			}
			else if(i==0) {
				System.out.println(i+" "+tab[i].toString());//OK pour l'affichage des lignes
			}
		}
		
		
	}//fin main()

}//fin Classe()
