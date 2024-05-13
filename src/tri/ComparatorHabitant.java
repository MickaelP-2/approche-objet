package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//fin main()

		//utiliser le nom de la classe comparator -> ex:Collections.sort(list, new PopulationCompaarator());
	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		int res = 0;
		int nb1 = Integer.parseInt(o1.getPopulationTotale().replace(" ",""));
		int nb2 = Integer.parseInt(o2.getPopulationTotale().replace(" ",""));
		if(nb1 > nb2) {
			res=1;
		}
		else if(nb1 < nb2) {
			res=-1;
		}
		else res=0;
		return res;
	}

}//fin Classe()
