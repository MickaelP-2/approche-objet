package entite;

public class Debit extends Operation{
	//classe mere: dateOperation, montantOperation
	private double montant;
	//
	public Debit(double montant){
		super("03/05/2024",montant);//constructeur de la classe mere avec argument de la classe fille
		// montant car somme créditée en +
	}
	//
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public String getType(){
		return "DEBIT";
	}
}