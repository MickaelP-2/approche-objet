package fr.diginamic.jdr.classe;
//
import fr.diginamic.jdr.classe.tirageAleatoire;
//
public class Personnage {
	private int force;
	private int pv;
	private int score;
	//
	public Personnage(){
		tirageAleatoire ta = new tirageAleatoire();
		this.force = ta.D6()+11;//12 a 18
		this.pv = (ta.D10()*3)+20;//20 a 50
		this.score = 0;
	}
	//
	public Personnage(int force, int pv, int score){
		this.force = force;
		this.pv = pv;
		this.score = 0;//valeur par defaut =0 en debut de partie
	}//fin constructeur avec arguments
	//setters et getters
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//
	public String toString() {
		//Pour affcher le statut du personnage
		return " Force: "+this.force+" PV: "+this.pv+" Score: "+this.score;
	}
}