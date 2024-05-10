package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
	/**
	 * Extraire les 100 premieres lignes du ficheir d e recebsement et les copier 
	 * dans un nouveau fichier
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Declaration des deux fichiers: lecture(source),ecriture(destination)
		Path origine =  Paths.get("C:/Users/Utilisateur/Documents//GIT-UX//12. Java approche objet/TP/recensement.csv");
		Path destination = Paths.get("C://Users//Utilisateur//Documents//workspace-spring-tool-suite-4-4.22.0.RELEASE2//DevoirsDiginamic//bin//fichier//FileCopy.txt");
		//C:\Users\Utilisateur\Documents\workspace-spring-tool-suite-4-4.22.0.RELEASE2\DevoirsDiginamic\bin\fichier
		//test existence
		System.out.println("Ressource éxistante:  "+Files.exists(origine));
		System.out.println("destination éxistante:  "+Files.exists(destination));
		if(Files.exists(destination)==false) {
			//Création du ficheir des destination si non existant
			Files.createFile(destination);
			System.out.println("destination créée!!");
		}
		System.out.println("fichier regulier: "+Files.isRegularFile(origine));
		System.out.println("Lisible: "+Files.isReadable(origine));
		//System.out.println("-"+Files.readAllLines(origine));
		List<String> lines = new ArrayList<>();
		lines = Files.readAllLines(origine, StandardCharsets.UTF_8);
		//Affichage des lignes du fichier
		System.out.println("lines size: "+lines.size());
		Object[] tab = lines.toArray();
		//Creation d'un tableau d'objets pour copier les données du fichier de recensement
		for(int i=0;i<=100;i++) {
			//StandardOpenOption.APPEND pour ajouter les 100 premieres ligens du ficheir+entete(premiere ligne)
			Files.writeString(destination,(i+" "+tab[i].toString()+"\n"),StandardOpenOption.APPEND);
		}
		System.out.println("Fin de la copie du fichier de recensement!");
	}//fin main()

}//fin Classe()
