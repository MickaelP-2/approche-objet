package fr.diginamic.jdr.test;

import java.util.Scanner;

//
import fr.diginamic.jdr.classe.Creature;
import fr.diginamic.jdr.classe.Personnage;
import fr.diginamic.jdr.classe.Gobelin;
import fr.diginamic.jdr.classe.Loup;
import fr.diginamic.jdr.classe.Troll;
import fr.diginamic.jdr.classe.tirageAleatoire;
//
public class Menu {
	/**
	 * Calcul de l'attaque des 2 adversaires -> D10+force des adversaires
	 * gagnant: + fort score
	 * degats: score_gagnant-score_perdant
	 * pv = pv-degats
	 * si pv = 0 fin du combat
	 * score:+1=loup,+2=gobelin;+5=troll
	 */
	static Personnage perso;
	static Loup loup;
	static Gobelin gobelin;
	static Troll troll;
	static boolean action = false;
	static boolean fin = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean fin = false;
		int choix = 0, selection = 0;
		//static Personnage perso = null;//pour le personnage
		Scanner scan = new Scanner(System.in);
		while(fin==false) {
		System.out.println("********************************\n* JDR:                         *\n* Pour créer un personnage:  1 *\n* Pour combattre:            2 *\n* Pour quitter:              3 *\n********************************");
		choix = scan.nextInt();
		switch (choix) {
			case 1:{
				perso = new Personnage();
				System.out.println("perso: "+perso.toString());
			}
			break;
			case 2:{
				if(perso==null) {
					perso = new Personnage();//Pour crée un personnage automatiquement
					System.out.println("Perso: \n"+perso.toString());
				}
				while(action==false) {
					System.out.println("********************************\n* Adversaires:                 *\n* Loup:                      1 *\n* Gobelin:                   2 *\n* Troll:                     3 *\n* Hasard:                    4 *\n* Quitter:                   5 *\n********************************");
					selection = scan.nextInt();
					switch (selection){
						case 1:{
							//loup
							System.out.println("loup!!");
							loup = new Loup();
							System.out.println(""+loup.toString());
							Combat(loup);
						}
						break;
						case 2:{
							//gobelin
							System.out.println("gobelin");
							gobelin = new Gobelin();
							gobelin.toString();
							Combat(gobelin);
						}
						break;
						case 3:{
							//troll
							System.out.println("troll");
							troll = new Troll();
							troll.toString();
							Combat(troll);
						}
						break;
						case 4:{
							//tirage de l'adversaire
							System.out.println("Surprise??");
							tirageAleatoire ta = new tirageAleatoire();
							int nb = ta.D10();
							if(nb>=0 && nb<=4) {
								loup = new Loup();
								loup.toString();
								Combat(loup);
							}
							else if(nb>4 && nb<=8) {
								gobelin = new Gobelin();
								gobelin.toString();
								Combat(gobelin);
							}
							else if(nb>8 && nb<=10) {
								troll = new Troll();
								troll.toString();
								Combat(troll);
							}
						}
						break;
						case 5:{
							action=true;
						}
						break;
						default:{
							System.out.println("Choix non pris en charge!");
						}
						break;
						}//fin switch()
				}//fin while()
			}
			break;
			case 3:{
				fin = true;
			}
			break;
			default:{
				System.out.println("Choix non pris en charge!");
			}
			break;
		}//fin switch()
		}//fin while(fin)
		scan.close();
		if(perso==null) {
			System.out.println("Au revoir... ");
		}
		else if(perso!=null) {
			System.out.println("Score final: "+perso.getScore()+"\n Au revoir... ");
		}//fin else if()
		
	}//fin main()
////////////////////////////////////////////////////////////////////
	
	public static void Combat(Creature creature){
		int score_perso = 0, score_creature = 0, degats = 0;
		tirageAleatoire ta = null;//new tirageAleatoire();
		while(creature.getPv()>=0) {
			ta = new tirageAleatoire();//tirage du perso
			score_perso = perso.getForce()+ta.D10();
			ta = new tirageAleatoire();//tirage de la creature
			score_creature = creature.getForce()+ta.D10();
			if(score_perso>score_creature) {
				degats = score_perso-score_creature;
				creature.setPv(creature.getPv()-degats);
				if(creature.getPv()<=0) {
					if(creature instanceof Loup) {
						System.out.println("Le loup est mort!");
						perso.setScore(perso.getScore()+1);
					}
					if(creature instanceof Gobelin) {
						perso.setScore(perso.getScore()+2);
						System.out.println("Le gobelin est mort!");
					}
					if(creature instanceof Troll) {
						perso.setScore(perso.getScore()+5);
						System.out.println("Le troll est mort!");
					}
				}
			}//fin if()
			if(score_perso<score_creature) {
				degats = score_creature-score_perso;
				perso.setPv(perso.getPv()-degats);
				if(perso.getPv()<=0) {
					System.out.println(" Votre personnage est mort!!");
					Menu.action = true;
				}
			}//fin else if()
		}//fin while()
	}//fin classe()
	
////////////////////////////////////////////////////////////////////
}//fin classe()
