package entite;

public abstract class Operation {
	private String dateOperation;//
	private double montantOperation;
	//
	Operation(String date, double montant){
		this.dateOperation = date;
		this.montantOperation = montant;
	}//fin constructeur()
	//stters et getters
	public String getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getMontantOperation() {
		return montantOperation;
	}
	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}
	public String toString(){
		return dateOperation+" "+montantOperation;//+ getType()
	}
	public abstract String getType();
}
