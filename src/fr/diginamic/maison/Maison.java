package fr.diginamic.maison;

import java.util.Arrays;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.SalledeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;
import fr.diginamic.maison.Piece;

public class Maison {
	//1 attribut = tableau de Piece
	Piece[] tab = new Piece[0];
	//
	public void ajouterPiece(Piece piece) {
		//permet d'ajouter une piece
		if(piece !=null) {//structure de controle
			tab = Arrays.copyOf(tab,tab.length+1);//Pour augmenter la taille du tableau de piece
			tab[tab.length-1] = piece;
		}//fin if()
		else {
			System.out.println("donnée non valide!");//Message qui affiche donnée non valide
			return;
		}//fin else()
	}//fin ajouterPiece()
	
	public double superficieTotale() {
		//retourne la superficieTotale
		double superficieTotale = 0.0;
		for (int i=0;i<tab.length;i++) {
			//Boucle qui parcoure le tableau de piece et calcul la superficie
			superficieTotale = superficieTotale+tab[i].getSuperficie();
		}//fin for()
		return superficieTotale;
	}//fin superficieTotale()
	
	public double superficieEtage(int etage) {
		//retourne la superficie d'un etage
		double superficieTotale = 0.0;
		for (int i=0;i<tab.length;i++) {
			//Boucle qui parcoure le tableau de piece et calcul la superficie
			if(etage == tab[i].getNumeroEtage()) {
				superficieTotale = superficieTotale+tab[i].getSuperficie();
			}//fin if()
		}//fin for()
		return superficieTotale;
	}//fin superficieEtage()
	
	public String surfaceGlobale(Piece piece) {
		//doit retourner la surface des pieces de type piece
		double surfaceGlobale = 0.0;
		String nom = null;
		for( int i=0;i<tab.length;i++) {
			//System.out.println("tab: "+tab[i].toString());
			if( tab[i] instanceof Chambre && (piece instanceof Chambre)) {
				nom = "chambre(s)";
				surfaceGlobale = surfaceGlobale + tab[i].getSuperficie();
			}
			else if( tab[i] instanceof Cuisine && (piece instanceof Cuisine)) {
				nom = "cuisine(s)";
				surfaceGlobale = surfaceGlobale + tab[i].getSuperficie();
			}
			else if( tab[i] instanceof SalledeBain && (piece instanceof SalledeBain)) {
				nom = "salle(s) de bain";
				surfaceGlobale = surfaceGlobale + tab[i].getSuperficie();
			}
			else if( tab[i] instanceof Salon && (piece instanceof Salon)) {
				nom = "salon(s)";
				surfaceGlobale = surfaceGlobale + tab[i].getSuperficie();
			}
			else if( tab[i] instanceof WC && (piece instanceof WC)) {
				nom = "wc";
				surfaceGlobale = surfaceGlobale + tab[i].getSuperficie();
			}
		}//fin for()
		return nom+": "+surfaceGlobale+" m²";
	}//fin surfaceGlobale()
	public String nombreGlobal(Piece piece) {
		//doit retourner la surface des pieces de type piece
		int nombreGlobal = 0;
		String nom = null;
		for( int i=0;i<tab.length;i++) {
			//System.out.println("tab: "+tab[i].toString());
			if( tab[i] instanceof Chambre && (piece instanceof Chambre)) {
				nom = "chambre(s)";
				nombreGlobal++;
			}
			else if( tab[i] instanceof Cuisine && (piece instanceof Cuisine)) {
				nom = "cuisine(s)";
				nombreGlobal++;
			}
			else if( tab[i] instanceof SalledeBain && (piece instanceof SalledeBain)) {
				nom = "salle(s) de bain";
				nombreGlobal++;
			}
			else if( tab[i] instanceof Salon && (piece instanceof Salon)) {
				nom = "salon(s)";
				nombreGlobal++;
			}
			else if( tab[i] instanceof WC && (piece instanceof WC)) {
				nom = "wc";
				nombreGlobal++;
			}
		}//fin for()
		return nom+": "+nombreGlobal;
	}//fin nombreGlobale()
}//fin Classe Maison()
