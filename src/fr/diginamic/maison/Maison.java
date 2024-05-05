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
		if(piece !=null) {//structuere de controle
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
			//**System.out.println(i+" "+tab[i].getSuperficie());
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
}//fin Classe Maison()
