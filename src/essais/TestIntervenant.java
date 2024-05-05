package essais;
//
//**import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

//
public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie sal1 = new Salarie("Bonn ","Jean",1250.75);
		Pigiste pig1 = new Pigiste("Petit","Jean",4.5F,75.0D);
		//**System.out.println("Salaire salarié: "+sal1.getSalaire());
		sal1.verifStatut(sal1);
		System.out.println("-> "+sal1.afficherDonnees());
		//**System.out.println("Salaire pigiste: "+pig1.getSalaire());
		pig1.verifStatut(pig1);
		System.out.println("-> "+pig1.afficherDonnees());
	}//fin main()

}//fin classe TestIntervenant()
