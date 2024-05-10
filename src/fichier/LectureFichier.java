package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//telecharger le fichier recencement.csv
		Path origine =  Paths.get("C:/Users/Utilisateur/Documents//GIT-UX//12. Java approche objet/TP/recensement.csv");
		//test existence
		System.out.println("Ressource éxistante:  "+Files.exists(origine));
		System.out.println("fichier regulier: "+Files.isRegularFile(origine));
		//Files.isRegularDirectory(origine)-> pour un repertoire
		System.out.println("Lisible: "+Files.isReadable(origine));
		System.out.println("-"+Files.readAllLines(origine));
		List<String> lines = Files.readAllLines(origine, StandardCharsets.UTF_8);
		//Affichage des lignes du fichier
		System.out.println("lines: "+lines.size());
		Object[] tab = lines.toArray();//limites du type int??
		for(int i=0;i<tab.length;i++) {
			System.out.println(i+" "+tab[i].toString());//OK pour l'affichage des lignes
		}
		
	}

}
