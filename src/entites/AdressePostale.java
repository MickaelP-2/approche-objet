package entites;

public class AdressePostale {
	
		public int numeroDeRue;
		public String libelleDeRue;
		public int codePostal;
		public String ville;
		
		public AdressePostale() {
			
		}//fin constructeur()
		public AdressePostale(int num, String libelrue, int codpost, String ville) {
			this.numeroDeRue = num;
			this.libelleDeRue = libelrue;
			this.codePostal = codpost;
			this.ville = ville;
		}//fin constructeur avec aguments()
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
