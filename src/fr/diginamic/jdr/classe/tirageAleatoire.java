package fr.diginamic.jdr.classe;

public class tirageAleatoire {
	private int nb;//pour le tirage
	//
	
	public int D10() {
		//tirage du D10
		nb = (int)(Math.random()*10);
		return nb;
	}
	
	public int D6() {
		//tirage du D10
		nb = (int)(Math.random()*10);
		if(nb==1 || nb==2) {
			nb=1;
		}
		else if(nb==3 || nb==4) {
			nb=2;
		}
		else if(nb==5 || nb==6) {
			nb=3;
		}
		else if(nb==7 || nb==8) {
			nb=4;
		}
		else if(nb==9 || nb==0) {
			nb=5;
		}
		else if(nb==0) {
			nb=6;
		}
		return nb;
	}
}
