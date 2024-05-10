package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LireFichierAvecInstanciation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Créer un arrayList de ville vide
		ArrayList<Ville> listville = new ArrayList<>();
		List<String> list = new ArrayList<>();
		//lire le contenu du fichier de recensement
		Path origine =  Paths.get("C:/Users/Utilisateur/Documents//GIT-UX//12. Java approche objet/TP/recensement.csv");
		//Verification de l'éxistance du fichier de recensement
		System.out.println("Ressource éxistante:  "+Files.exists(origine));
		list = Files.readAllLines(origine,StandardCharsets.UTF_8);
		//Lire le contenu du fichier et a chaque ligne creer une instance de classe ville 
		// et la stocker dans une arrayList
		Iterator<String> iterator = list.iterator();
		iterator.next();//Pour passer la premeire ligne
		while(iterator.hasNext()) {
			//1 ville a chaque ligne
			String ligne = iterator.next();
			Ville ville =  new Ville();//declaration du type ville
			String[] tokens = ligne.split(";");//Pour separer les differnets champs
			ville.setNom(tokens[6]);
			ville.setCodeDepartement(tokens[4].toString());
			ville.setNomRegion(tokens[1]);
			ville.setPopulationTotale(tokens[9].toString());
			listville.add(ville);
		}//fin while)
		System.out.println("Fin lecture: "+listville.size());
		for(Ville ville : listville) {
			System.out.println(ville.toString());
		}
	}//fin main()

}//Fin classe()

