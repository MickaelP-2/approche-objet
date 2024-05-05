package essais;
import entite.Theatre;
//
public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre TH = new Theatre();//appel au constructeur par defaut
		TH.setNom("The atre");//definit le nom
		TH.setMaxPlace(100);//definit le nombre de places
		TH.setClientInscrit(0);//definit le nombre d'inscrits
		TH.setRecetteTotale(0.0);//definit la recette
		//**System.out.println(TH.toString());
		TH.inscrire(25,11.5);
		System.out.println(TH.toString());
		TH.inscrire(45,7.75);
		System.out.println(TH.toString());
		TH.inscrire(25, 8.75);
		System.out.println(TH.toString());
		TH.inscrire(15,7.75);
		//Pour afficher le nombre de clients inscrits et la recette
		System.out.println(TH.toString());
	}//fin main()
	
}//fin Classe()
