package tri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TriVille {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Ville> listVille = new ArrayList<Ville>();
		List<String> list = new ArrayList<>();
		Path origine =  Paths.get("C:/Users/Utilisateur/Documents//GIT-UX//12. Java approche objet/TP/recensement.csv");
		//Collections.addAll(list,new Ville("Nice","343000") , new Ville("Carcassonne","47800"), new Ville("Narbonne","53400"), new Ville("Lyon","484000"), new Ville("Foix","9700"), new Ville("Pau","77200"), new Ville("Marseille","850700"), new Ville("Tarbes","40600"));
		list = Files.readAllLines(origine,StandardCharsets.UTF_8);
		Collections.sort(list);
		Iterator<String> iterator = list.iterator();
		iterator.next();//Pour passer la premiere ligne(entete)
		while(iterator.hasNext()) {
			//1 ville a chaque ligne
			String ligne = iterator.next();
			Ville ville =  new Ville();//declaration du type ville
			String[] tokens = ligne.split(";");//Pour separer les differnets champs
			String population = tokens[9].trim().replaceAll(" ","");//pour supprimer les espaces pour le calcul du nombre
			
				ville.setNom(tokens[6]);
				ville.setCodeDepartement(tokens[4].toString());
				ville.setNomRegion(tokens[1]);
				ville.setPopulationTotale(tokens[9].toString());
				listVille.add(ville);
			
		}//fin while)
		Collections.sort(listVille);
		for(Ville ville: listVille){
			System.out.println("->"+ville.toString());
		}
	}//fin main()

}//fin Classe()