package sets;

public class Pays {
	/**	ONU 2021/données FMI 2017
	 * USA:336 997 624/59 495($ )
	 * France:64 531 444/43 551
	 * Allemagne:83 408 554/50 206
	 * UK:67 281 039/43 620
	 * Italie:59 240 329/37 970
	 * Japon:124 612 530/42 659
	 * Chine:1 425 893 465/16 624
	 * Russie:145 102 755/28 712
	 * Inde:1 407 563 842/5174
	 * 
	 */
	private String nom;
	private String nbHabitant;
	private String PIBHabitant;
	//
	public Pays() {
		this.nom = null;
		this.nbHabitant = null;
		this.PIBHabitant = null;
	}//constructeur sans argument()
	public Pays(String nom,String habitant,String PIBHabitant) {
		this.nom = nom;
		this.nbHabitant = habitant;
		this.PIBHabitant = PIBHabitant;
	}//constructeur sans argument()
	//
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(String nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	public String getPIBHabitant() {
		return PIBHabitant;
	}
	public void setPIBHabitant(String pIBHabitant) {
		PIBHabitant = pIBHabitant;
	}
	//
	public String toString() {
		return nom+" "+nbHabitant+" "+PIBHabitant;
	}
}
