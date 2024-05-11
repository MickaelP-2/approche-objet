package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declarer un tableau d'objetGeometrique. Taille de 2
		ObjetGeometrique[] tabObj= new ObjetGeometrique[2];
		tabObj[0] = new Cercle(3);
		tabObj[1] = new Rectangle(3,2);
		for(ObjetGeometrique objG : tabObj) {
			System.out.println("Perimetre: "+objG.perimetre());//cercle , rectangle =OK
			System.out.println("Surface: "+objG.surface());//cercle,rectangle=OK
			
		}
	}//fin main()

}//fin Classe()
