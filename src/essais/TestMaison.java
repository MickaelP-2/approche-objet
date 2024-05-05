package essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.SalledeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;
import fr.diginamic.maison.Piece;

import fr.diginamic.maison.Maison;
//
public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison maison = new Maison();
		Chambre chambre = new Chambre(25,0);
		maison.ajouterPiece(chambre);
		WC wc = new WC(10,0);
		maison.ajouterPiece(wc);
		//Cuisine cuis = new Cuisine(-10,-2);
		//maison.ajouterPiece(cuis);
		//maison.ajouterPiece(null);//structure conditionnelle dans Maison
		System.out.println("Superficie: "+maison.superficieTotale());
		System.out.println("Superficie de l'étage: "+maison.superficieEtage(3));
	}//fin main()

}//Fin classe TestMaison()
