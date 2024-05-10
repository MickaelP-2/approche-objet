package fichier;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class GenererFichier {
	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Créer un arrayList de ville vide
		ArrayList<Ville> listville = new ArrayList<>();
		List<String> list = new ArrayList<>();
		//lire le contenu du fichier de recensement
		Path origine =  Paths.get("C:/Users/Utilisateur/Documents//GIT-UX//12. Java approche objet/TP/recensement.csv");
		Path destination = Paths.get("C://Users//Utilisateur//Documents//workspace-spring-tool-suite-4-4.22.0.RELEASE2//DevoirsDiginamic//bin//fichier//CopyRecensement.txt");
		//Verification de l'éxistance du fichier de recensement
		System.out.println("Ressource éxistante:  "+Files.exists(origine));
		if(Files.exists(destination)==false) {
			//Création du ficheir des destination si non existant
			Files.createFile(destination);
			System.out.println("destination créée!!");
		}
		list = Files.readAllLines(origine,StandardCharsets.UTF_8);
		//Lire le contenu du fichier et a chaque ligne creer une instance de classe ville 
		// et la stocker dans une arrayList
		String entete = "Nom de la commune;Code du département;Nom de la région;Population";//Premiere ligne
		Files.writeString(destination, entete);//Copie de la premiere ligne avec informations utilisées dans le fichier
		Iterator<String> iterator = list.iterator();
		iterator.next();//Pour passer la premiere ligne(entete)
		while(iterator.hasNext()) {
			//1 ville a chaque ligne
			String ligne = iterator.next();
			Ville ville =  new Ville();//declaration du type ville
			String[] tokens = ligne.split(";");//Pour separer les differnets champs
			String population = tokens[9].trim().replaceAll(" ","");//pour supprimer les espaces pour le calcul du nombre
			if(Long.parseLong(population)>=25000) {
				ville.setNom(tokens[6]);
				ville.setCodeDepartement(tokens[4].toString());
				ville.setNomRegion(tokens[1]);
				ville.setPopulationTotale(tokens[9].toString());
				listville.add(ville);
				//Ajouter dans le fichier
				Files.writeString(destination,(ville.toString()+"\n"),StandardOpenOption.APPEND);
			}
			
		}//fin while)
		System.out.println("Fin lecture: "+listville.size());
		for(Ville ville : listville) {
			System.out.println(ville.toString());
		}
	}//fin main()

}//fin Classe()
