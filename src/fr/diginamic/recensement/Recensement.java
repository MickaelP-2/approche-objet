package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Recensement {
	//possede la liste des villes du fichier de recensement
	private List<String> liste;//type String pour la ligne contenue dans le fichier .csv
	//
	public Recensement() throws IOException{
		Path origine =  Paths.get("C:/Users/Utilisateur/Documents//workspace-spring-tool-suite-4-4.22.0.RELEASE2/approche_objet/recensement.csv");;
		this.liste = Files.readAllLines(origine,StandardCharsets.UTF_8);
		System.out.println("constructeur Recensement");
	}
	//
	public List<String> getListe() {
		return liste;
	}
	public void setListe(List<String> liste) {
		this.liste = liste;
	}
	//
	@Override
	public String toString() {
		return "Recensement [liste=" + liste + "]";
	}
	
}
