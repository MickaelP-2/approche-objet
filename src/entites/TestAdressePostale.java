package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroDeRue = 22;
		adr1.libelleDeRue = "impasse des fonds";
		adr1.codePostal = 34000;
		adr1.ville = "Montpellier";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroDeRue = 11;
		adr2.libelleDeRue = "rue Desrues";
		adr2.codePostal = 30000;
		adr2.ville = "Nimes";
	}

}
