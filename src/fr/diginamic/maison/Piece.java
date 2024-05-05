package fr.diginamic.maison;

public abstract class Piece {
	//2 attibuts de classe
	private double superficie;
	private int numeroEtage;//0 pour RDC,...
	//
	public Piece(double superficie, int numetage) {
		this.superficie = superficie;
		this.numeroEtage = numetage;
	}//fin constructeur()
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public int getNumeroEtage() {
		return numeroEtage;
	}
	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}
	
	
}//fin public abstract class Piece()
