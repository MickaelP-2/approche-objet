package fr.diginamic.testenumeration;

public enum Saison {
	/**
	 * Enumeration Saison, pour représenter les 4 saisons
	 */
		PRINTEMPS("Printemps",1),
		ETE("Ete",2),
		AUTOMNE("Automne",3),
		HIVER("Hiver",4);
		
		/**
		 * variable libelle pour le nom de la saison, de type String
		 */
		private String libelle;
		/**
		 * variable numero pour le numero de la saison, de type Integer
		 */
		private int numero;
		/**
		 * Constructeur avec arguments en paramètres
		 * @param nom pour le nom de la saison (String)
		 * @param num pour le numero de la saison (Integer int)
		 */
		private Saison(String nom, int num) {
			this.libelle = nom;
			this.numero = num;
		}
		/**
		 * getter qui retourne le numéro de la saison
		 * @return numero
		 */
		public int getNumero() {
			return numero;
		}
		/**
		 * setter pour modifier le numéro de la saison
		 * @param numero
		 */
		public void setNumero(int numero) {
			this.numero = numero;
		}
		/**
		 * getter qui retourne le libelle de la saison
		 * @return libelle
		 */
		public String getLibelle() {
			return libelle;
		}
		/**
		 * setter qui permet de modifier le libelle de la saison
		 * @param libelle
		 */
		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}
		public static Saison recherche(String str) {
			Saison res = null;
			Saison[] saisons = Saison.values();
				for(Saison saison : saisons) {
					if(saison.getLibelle().equals(str)) {
						res = saison;
					}
				}
			return res;
		}
		
		public String toString() {
			return this.libelle+" "+this.numero;
		}
		
}
