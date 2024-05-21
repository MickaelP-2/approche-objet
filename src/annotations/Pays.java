package annotations;

import java.lang.reflect.Field;
import annotations.ToString;

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
	/**
	 * Classe de déclaration de la classe Pays
	 * variable nom de type String
	 * variable nbHabiatant de type String
	 * variable PIBHabitant de type String
	 */
	@ToString(uppercase=false, separator="->")//pour utiliser l'annotation sur l'attribut nom(espace,en minuscule)
	private String nom;
	//@ToString//pour utiliser l'annotation sur l'attribut nbHabitant à l'affichage
	private String nbHabitant;
	@ToString(uppercase=true, separator=" $")//pour utiliser l'annotation sur l'attribut PIBHabitant à l'affichage
	private String PIBHabitant;
	//
	/**
	 * Constructeur sans argument
	 * Nécéssite les setters pour les variables
	 */
	
	public Pays() {
		this.nom = null;
		this.nbHabitant = null;
		this.PIBHabitant = null;
	}//constructeur sans argument()
	/**
	 * Constructeur avec arguments pour créer une instance de la classe pays
	 * @param nom
	 * @param habitant
	 * @param PIBHabitant
	 */
	public Pays(String nom,String habitant,String PIBHabitant) {
		
		this.nom = nom;
		this.nbHabitant = habitant;
		this.PIBHabitant = PIBHabitant;
	}//constructeur avec argument()
	//
	/**
	 * retourne le nom pays
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * affecte la variable nom du pays
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * retourne le nombre d'habitant du pays
	 * @return nbHabitant
	 */
	public String getNbHabitant() {
		return nbHabitant;
	}
	/**
	 * affecte la variable nbHabitant de l'objet pays
	 * @param nbHabitant
	 */
	public void setNbHabitant(String nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	/**
	 * retourne la valeur du PIB par Habitant
	 * @return PIBHabitant
	 */
	public String getPIBHabitant() {
		return PIBHabitant;
	}
	/**
	 * affecte la valeur du PIB par habitant de l'objet pays
	 * @param pIBHabitant
	 */
	public void setPIBHabitant(String pIBHabitant) {
		PIBHabitant = pIBHabitant;
	}
	//
	/**
	 * Redefinition de la méthode toString, qui affiche les variable de l'objet pays
	 * @ToString
	 */
	@Override
	public String toString() {
		
		return this.getNom().toUpperCase()+"->"+this.getPIBHabitant()+" $";
	}
}

