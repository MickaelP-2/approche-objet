package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pour les types primitifs utiliser le nom de classe 
		ArrayList<Integer> list = new ArrayList<Integer>();
		//
		for(int i = 1;i<=100;i++) {
			list.add(i);
		}//fin for()
		System.out.println("size: "+list.size());
	}//fin main()

}//fin Classe()
