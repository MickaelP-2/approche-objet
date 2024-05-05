package fr.diginamic.salaire;
//classe fille de Intervenant
public class Salarie extends Intervenant{
	private double salaireMensuel;//attribut de classe
	//
	public Salarie(String nom, String prenom, double salaire) {
		super(nom,prenom);
		this.salaireMensuel = salaire;
	}
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaireMensuel;
	}//fin double getSalaire()

}
