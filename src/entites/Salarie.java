package entites;

public class Salarie {
	private String nom;
	private String prenom;
	private double salaire;
	//
	public Salarie(){
		this.nom = null;
		this.prenom = null;
		this.salaire = 0.0;
	}//fin costructeur()
	public Salarie(String chaine){
		String[] tab = chaine.split(";");
		this.nom = tab[0];
		this.prenom = tab[1];
		tab[2] = tab[2].replace(" ","");
		this.salaire = Double.parseDouble(tab[2].toString());//conversion = OK
	}//fin costructeur()
	public String toString() {
		return "\n nom: "+this.nom+" "+this.prenom+"\n Salaire: "+this.salaire;
	}//fin public String toString()
}
