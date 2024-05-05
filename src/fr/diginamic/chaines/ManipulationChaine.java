package fr.diginamic.chaines;
import entites.Salarie;
public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;2 523.5";//; pour separer les informations
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("length: "+chaine.length());
		System.out.println("index of ; : "+chaine.indexOf(';'));
		System.out.println("->"+chaine.substring(7,13));
		System.out.println("?: "+chaine.substring(0,(chaine.indexOf(';'))));
		System.out.println("MAJ: "+(chaine.substring(0,(chaine.indexOf(';'))).toUpperCase()));//afficher en majuscules
		System.out.println("min: "+(chaine.substring(0,(chaine.indexOf(';'))).toLowerCase()));//afficher en minuscules
		//utiliser la methode split() pour decouper la chaine en morceaux
		//separateur = ; , retourne un tableau de String
		String[] tab = chaine.split(";");
		for (int i =0;i<tab.length;i++) {
			System.out.println(" "+tab[i].toString());
		}//fin for()
		Salarie sal1 = new Salarie(chaine);
		System.out.println("salarie: "+sal1.toString());
	}//fin main(

}//fin Classe()
