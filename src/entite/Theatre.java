package entite;

public class Theatre {
	private String nom; // a definir
	private int maxPlace; // a definir
	private int ClientInscrit ;//a definir
	private double recetteTotale = 0.0;
	
	public void inscrire(int nbClient, double prixPlace) {
		ClientInscrit = ClientInscrit+nbClient; 
		if(ClientInscrit <=maxPlace) {
			recetteTotale = recetteTotale + (nbClient*prixPlace);
		}
		else System.out.println("Plus de places disponibles!");
	}
	public String toString() {
		return " Théatre: "+this.nom+ "\n places maximum: "+this.maxPlace+"\n inscrits:"+ClientInscrit+"\n "+recetteTotale;
	}//fin public String toString()
	//setters et getters -> pour acceder aux attributs apres utilisation du constructeur sans arguments
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMaxPlace() {
		return maxPlace;
	}

	public void setMaxPlace(int maxPlace) {
		this.maxPlace = maxPlace;
	}

	public int getClientInscrit() {
		return ClientInscrit;
	}

	public void setClientInscrit(int ClientInscrit) {
		this.ClientInscrit = ClientInscrit;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}//fin inscrire()
}
