package diginamic.banque;
//
import entite.Debit;//import de la classe Debit
import entite.Operation;
import entite.Credit;//import de la classe Credit
import entite.Compte;//import de la clase Compte
import entite.CompteTaux;//import de la classe CompteTaux
//
public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation[] tablo = new Operation[5];
		String date = "03/05/2024";
		//Credit cred = new Credit(150.00);
		tablo[0] = new Credit(150.00);
		tablo[1] = new Debit(50.00);
		tablo[2] = new Debit(25.00);
		tablo[3] = new Credit(75.00);
		tablo[4] = new Credit(2.75);
		//
		double montant_global = 0.0;
		for(int i = 0;i<tablo.length;i++) {
			if(tablo[i].getType().equals("CREDIT")==true) {
				montant_global = montant_global+tablo[i].getMontantOperation();
			}
			else if(tablo[i].getType().equals("DEBIT")==true) {
				montant_global = montant_global+(tablo[i].getMontantOperation()*-1);
			}
			System.out.println("operations: "+tablo[i].toString()+" "+tablo[i].getType());
		}//fin for()
		System.out.println("Solde des opérations de la période: "+montant_global);
	}

}
