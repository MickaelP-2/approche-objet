package fr.diginamic.jdr.classe;


public abstract class Creature {
	//attributs de classe
	private int force;
	private int pv;
	//private String nom;
	//
	public Creature(){
		this.force = 0;
		this.pv = 0;
	}
	
	public Creature(int force, int pv){
		this.force = force;
		this.pv = pv;
	}
	
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

	public String toString() {
		return " force: "+this.force+"\n pv: "+this.pv;
	}
}
