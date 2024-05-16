package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saison[] saisons = Saison.values();
		for(Saison saison : saisons) {
			System.out.println(saison.getLibelle());
		}
		String libelle = "ETE";
		Saison saison = Saison.valueOf(libelle);
		System.out.println(saison.toString());
		libelle = "Hiver";
		System.out.println(Saison.recherche(libelle));
	}

}
