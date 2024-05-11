package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetPays {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Pays> set = new HashSet<Pays>();
		set.add(new Pays("USA","336 997 624","59 495"));
		set.add(new Pays("France","64 531 444","43 551"));
		set.add(new Pays("Allemagne","83 408 554","50 206"));
		set.add(new Pays("UK","67 281 039","43 620"));
		set.add(new Pays("Italie","59 240 329","37 970"));
		set.add(new Pays("Japon","124 612 530","42 659"));
		set.add(new Pays("Chine","1 425 893 465","16 624"));
		set.add(new Pays("Russie","145 102 755","28 712"));
		set.add(new Pays("Inde","1 407 563 842","5 174"));
		//rechercher le pays avec le plus haut PIB/habitant
		Iterator<Pays> iterator = set.iterator();
		int pibHab = 0;
		String calc = null;
		Pays suivant = null,pays = null;
		while(iterator.hasNext()) {
			pays = iterator.next();
			calc = pays.getPIBHabitant().trim().replace(" ","");
			if(Integer.parseInt(calc)>pibHab){
				pibHab = Integer.parseInt(calc);
				suivant = pays;
			}
		}
		System.out.println("Pays: "+suivant.getNom()+"\n population: "+suivant.getNbHabitant()+"\n "+suivant.getPIBHabitant()+" $/habitant.");
		//rechercher le pays avec le PIB total le plus important et le plus petit
		iterator = set.iterator();
		long pibTotalMax = 0L,pibTotalMin = 10000000000000L;//valeur des extremes par defaut
		String calc1 = null, calc2 = null;//Pour le calcul -> string sans espace
		suivant = null;
		Pays suivant2 = null;
		pays = null;
		while(iterator.hasNext()) {
			pays = iterator.next();
			calc1 = pays.getPIBHabitant().trim().replace(" ","");
			calc2 = pays.getNbHabitant().trim().replace(" ","");
			if((Long.parseLong(calc1)*Long.parseLong(calc2))>pibTotalMax){
				pibTotalMax = (Long.parseLong(calc1)*Long.parseLong(calc2));
				suivant = pays;
			}
			if((Long.parseLong(calc1)*Long.parseLong(calc2))<pibTotalMin){
				pibTotalMin = (Long.parseLong(calc1)*Long.parseLong(calc2));
				suivant2 = pays;
			}
		}
		System.out.println("Pays: "+suivant.getNom()+"\n population: "+suivant.getNbHabitant()+"\n PIB Total: "+pibTotalMax+" $.");
		//Modifier le HashSet pour mettre en majuscule le nom du pays ayant le plus petit pibTotal
		System.out.println("Pays: "+suivant2.getNom().toUpperCase()+"\n population: "+suivant2.getNbHabitant()+"\n PIB Total: "+pibTotalMin+" $.");
		//Mettre le nom du pays en majuscule
		iterator = set.iterator();
		while(iterator.hasNext()) {
			pays = iterator.next();
			//**System.out.println("->"+iterator.next());
			if(pays.getNom().equals(suivant2.getNom())){
				pays.setNom(pays.getNom().toUpperCase());//met le nom en majuscule
			}
		}
		//Affichage du set pour verification
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println("->"+iterator.next());//affichage du set
		}
		//Supprimer le plus petit PIB total 
		iterator = set.iterator();
		while(iterator.hasNext()) {
			//supprimer du set le pays avec le plus petit PIBTotal
			pays = iterator.next();
			if(pays.getNom().equals(suivant2.getNom())){
				iterator.remove();//supprimer le pays avec le plus petit PIB total
			}
		}
		//afficher le nouveau set
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());//affichage du nouveau set
		}
		//
	}//fin main()

}//fin Classe()
