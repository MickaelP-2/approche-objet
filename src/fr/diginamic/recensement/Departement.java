package fr.diginamic.recensement;

import java.util.Comparator;

public class Departement implements Comparator<Departement>{
	//String code departement-> Corse = 2A,2B
	//String nom departement
	//String codeRegion
	//String nomRegion
	//String Population
	
	private String codeDepartement;//-> Corse = 2A,2B
	private String nomDepartement;
	private String codeRegion;
	private String nomRegion;
	private int Population;
	//
	public Departement() {
		this.codeDepartement = null;
		this.nomDepartement = null;
		this.codeRegion = null;
		this.nomRegion = null;
		this.Population = 0;
	}//fin constructeur sans argument()
	public Departement(String codeDepartement, String nomdepartement, String codeRegion, String nomRegion, int population) {
		this.codeDepartement = codeDepartement;
		this.nomDepartement = nomdepartement;
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.Population = 0;
	}//fin constructeur avec arguments
	//
	public String getCodeDepartement() {
		return codeDepartement;
	}
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
	public String getCodeRegion() {
		return codeRegion;
	}
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	//
	@Override
	public String toString() {
		return "Departement [Code Departemental = " + codeDepartement + ", Nom du département = " + nomDepartement
				+ ", Code Région = " + codeRegion + ", Nom de la Région = " + nomRegion + ", Population = " + Population + "]";
	}
	//
	public String NomCodeDepartement(String nomDepartement) {
		//retourne le code du departement depuis l'argument nom en parametre
	String res = "";
	if(nomDepartement.equals("Ain")) {
		res = "01";
	}
	else if(nomDepartement.equals("Aisne")) {
		res = "02";
	}
	else if(nomDepartement.equals("Allier")) {
		res = "03";
	}
	else if(nomDepartement.equals("Alpes-de-Haute-Provence")) {
		res = "04";
	}
	else if(nomDepartement.equals("Hautes-Alpes")) {
		res = "05";
	}
	else if(nomDepartement.equals("Alpes-Maritimes")) {
		res = "06";
	}
	else if(nomDepartement.equals("Ardèche")) {
		res = "07";
	}
	else if(nomDepartement.equals("Ardennes")) {
		res = "08";
	}
	else if(nomDepartement.equals("Ariège")) {
		res = "09";
	}
	else if(nomDepartement.equals("Aube")) {
		res = "10";
	}
	else if(nomDepartement.equals("Aude")) {
		res = "11";
	}
	else if(nomDepartement.equals("Aveyron")) {
		res = "12";
	}
	else if(nomDepartement.equals("Bouches-du-Rhône")) {
		res = "13";
	}
	else if(nomDepartement.equals("Calvados")) {
		res = "14";
	}
	else if(nomDepartement.equals("Cantal")) {
		res = "15";
	}
	else if(nomDepartement.equals("Charente")) {
		res = "16";
	}
	else if(nomDepartement.equals("Charente-Maritime")) {
		res = "17";
	}
	else if(nomDepartement.equals("Cher")) {
		res = "18";
	}
	else if(nomDepartement.equals("Corrèze")) {
		res = "19";
	}
	else if(nomDepartement.equals("Corse-du-Sud")) {
		res = "2A";
	}
	else if(nomDepartement.equals("Haute-Corse")) {
		res = "2B";
	}
	else if(nomDepartement.equals("Côte-d'Or")) {
		res = "21";
	}
	else if(nomDepartement.equals("Côtes-d'Armor")) {
		res = "22";
	}
	else if(nomDepartement.equals("Creuse")) {
		res = "23";
	}
	else if(nomDepartement.equals("Dordogne")) {
		res = "24";
	}
	else if(nomDepartement.equals("Doubs")) {
		res = "25";
	}
	else if(nomDepartement.equals("Drôme")) {
		res = "26";
	}
	else if(nomDepartement.equals("Eure")) {
		res = "27";
	}
	else if(nomDepartement.equals("Eure-et-Loir")) {
		res = "28";
	}
	else if(nomDepartement.equals("Finistère")) {
		res = "29";
	}
	else if(nomDepartement.equals("Gard")) {
		res = "30";
	}
	else if(nomDepartement.equals("Haute-Garonne")) {
		res = "31";
	}
	else if(nomDepartement.equals("Gers")) {
		res = "32";
	}
	else if(nomDepartement.equals("Gironde")) {
		res = "33";
	}
	else if(nomDepartement.equals("Hérault")) {
		res = "34";
	}
	else if(nomDepartement.equals("Ille-et-Vilaine")) {
		res = "35";
	}
	else if(nomDepartement.equals("Indre")) {
		res = "36";
	}
	else if(nomDepartement.equals("Indre-et-Loire")) {
		res = "37";
	}
	else if(nomDepartement.equals("Isère")) {
		res = "38";
	}
	else if(nomDepartement.equals("Jura")) {
		res = "39";
	}
	else if(nomDepartement.equals("Landes")) {
		res = "40";
	}
	else if(nomDepartement.equals("Loir-et-Cher")) {
		res = "41";
	}
	else if(nomDepartement.equals("Loire")) {
		res = "42";
	}
	else if(nomDepartement.equals("Haute-Loire")) {
		res = "43";
	}
	else if(nomDepartement.equals("Loire-Atlantique")) {
		res = "44";
	}
	else if(nomDepartement.equals("Loiret")) {
		res = "45";
	}
	else if(nomDepartement.equals("Lot")) {
		res = "46";
	}
	else if(nomDepartement.equals("Lot-et-Garonne")) {
		res = "47";
	}
	else if(nomDepartement.equals("Lozère")) {
		res = "48";
	}
	else if(nomDepartement.equals("Maine-et-Loire")) {
		res = "49";
	}
	else if(nomDepartement.equals("Manche")) {
		res = "50";
	}
	else if(nomDepartement.equals("Marne")) {
		res = "51";
	}
	else if(nomDepartement.equals("Haute-Marne")) {
		res = "52";
	}
	else if(nomDepartement.equals("Mayenne")) {
		res = "53";
	}
	else if(nomDepartement.equals("Meurthe-et-Moselle")) {
		res = "54";
	}
	else if(nomDepartement.equals("Meuse")) {
		res = "55";
	}
	else if(nomDepartement.equals("Morbihan")) {
		res = "56";
	}
	else if(nomDepartement.equals("Moselle")) {
		res = "57";
	}
	else if(nomDepartement.equals("Nièvre")) {
		res = "58";
	}
	else if(nomDepartement.equals("Nord")) {
		res = "59";
	}
	else if(nomDepartement.equals("Oise")) {
		res = "60";
	}
	else if(nomDepartement.equals("Orne")) {
		res = "61";
	}
	else if(nomDepartement.equals("Pas-de-Calais")) {
		res = "62";
	}
	else if(nomDepartement.equals("Puy-de-Dôme")) {
		res = "63";
	}
	else if(nomDepartement.equals("Pyrénées-Atlantiques")) {
		res = "64";
	}
	else if(nomDepartement.equals("Hautes-Pyrénées")) {
		res = "65";
	}
	else if(nomDepartement.equals("Pyrénées-Orientales")) {
		res = "66";
	}
	else if(nomDepartement.equals("Bas-Rhin")) {
		res = "67";
	}
	else if(nomDepartement.equals("Haut-Rhin")) {
		res = "68";
	}
	else if(nomDepartement.equals("Rhône")) {
		res = "69";
	}
	else if(nomDepartement.equals("Haute-Saône")) {
		res = "70";
	}
	else if(nomDepartement.equals("Saône-et-Loire")) {
		res = "71";
	}
	else if(nomDepartement.equals("Sarthe")) {
		res = "72";
	}
	else if(nomDepartement.equals("Savoie")) {
		res = "73";
	}
	else if(nomDepartement.equals("Haute-Savoie")) {
		res = "74";
	}
	else if(nomDepartement.equals("Paris")) {
		res = "75";
	}
	else if(nomDepartement.equals("Seine-Maritime")) {
		res = "76";
	}
	else if(nomDepartement.equals("Seine-et-Marne")) {
		res = "77";
	}
	else if(nomDepartement.equals("Yvelines")) {
		res = "78";
	}
	else if(nomDepartement.equals("Deux-Sèvres")) {
		res = "79";
	}
	else if(nomDepartement.equals("Somme")) {
		res = "80";
	}
	else if(nomDepartement.equals("Tarn")) {
		res = "81";
	}
	else if(nomDepartement.equals("Tarn-et-Garonne")) {
		res = "82";
	}
	else if(nomDepartement.equals("Var")) {
		res = "83";
	}
	else if(nomDepartement.equals("Vaucluse")) {
		res = "84";
	}
	else if(nomDepartement.equals("Vendée")) {
		res = "85";
	}
	else if(nomDepartement.equals("Vienne")) {
		res = "86";
	}
	else if(nomDepartement.equals("Haute-Vienne")) {
		res = "87";
	}
	else if(nomDepartement.equals("Vosges")) {
		res = "88";
	}
	else if(nomDepartement.equals("Yonne")) {
		res = "89";
	}
	else if(nomDepartement.equals("Territoire de Belfort")) {
		res = "90";
	}
	else if(nomDepartement.equals("Essonne")) {
		res = "91";
	}
	else if(nomDepartement.equals("Hauts-de-Seine")) {
		res = "92";
	}
	else if(nomDepartement.equals("Seine-Saint-Denis")) {
		res = "93";
	}
	else if(nomDepartement.equals("Val-de-Marne")) {
		res = "94";
	}
	else if(nomDepartement.equals("Val-d'Oise")) {
		res = "95";
	}
	else if(nomDepartement.equals("Guadeloupe")) {
		res = "971";
	}
	else if(nomDepartement.equals("Martinique")) {
		res = "972";
	}
	else if(nomDepartement.equals("Guyane")) {
		res = "973";
	}
	else if(nomDepartement.equals("La Réunion")) {
		res = "974";
	}
	else if(nomDepartement.equals("Mayotte")) {
		res = "976";
	}
		return res;
	}
	
	
	public String CodeNomDepartement(String codeDepartement) {
		//retourne le nom du departement depuis l'argument code en parametre
	String res = null;
	if(codeDepartement.equals("01")) {
		res = "Ain";
	}
	else if(codeDepartement.equals("02")) {
		res = "Aisne";
	}
	else if(codeDepartement.equals("03")) {
		res = "Allier";
	}
	else if(codeDepartement.equals("04")) {
		res = "Alpes-de-Haute-Provence";
	}
	else if(codeDepartement.equals("05")) {
		res = "Hautes-Alpes";
	}
	else if(codeDepartement.equals("06")) {
		res = "Alpes-Maritimes";
	}
	else if(codeDepartement.equals("07")) {
		res = "Ardèche";
	}
	else if(codeDepartement.equals("08")) {
		res = "Ardennes";
	}
	else if(codeDepartement.equals("09")) {
		res = "Ariège";
	}
	else if(codeDepartement.equals("10")) {
		res = "Aube";
	}
	else if(codeDepartement.equals("11")) {
		res = "Aude";
	}
	else if(codeDepartement.equals("12")) {
		res = "Aveyron";
	}
	else if(codeDepartement.equals("13")) {
		res = "Bouches-du-Rhône";
	}
	else if(codeDepartement.equals("14")) {
		res = "Calvados";
	}
	else if(codeDepartement.equals("15")) {
		res = "Cantal";
	}
	else if(codeDepartement.equals("16")) {
		res = "Charente";
	}
	else if(codeDepartement.equals("17")) {
		res = "Charente-Maritime";
	}
	else if(codeDepartement.equals("18")) {
		res = "Cher";
	}
	else if(codeDepartement.equals("19")) {
		res = "Corrèze";
	}
	else if(codeDepartement.equals("2A")) {
		res = "Corse-du-Sud";
	}
	else if(codeDepartement.equals("2B")) {
		res = "Haute-Corse";
	}
	else if(codeDepartement.equals("21")) {
		res = "Côte-d'Or";
	}
	else if(codeDepartement.equals("22")) {
		res = "Côtes-d'Armor";
	}
	else if(codeDepartement.equals("23")) {
		res = "Creuse";
	}
	else if(codeDepartement.equals("24")) {
		res = "Dordogne";
	}
	else if(codeDepartement.equals("25")) {
		res = "Doubs";
	}
	else if(codeDepartement.equals("26")) {
		res = "Drôme";
	}
	else if(codeDepartement.equals("27")) {
		res = "Eure";
	}
	else if(codeDepartement.equals("28")) {
		res = "Eure-et-Loir";
	}
	else if(codeDepartement.equals("29")) {
		res = "Finistère";
	}
	else if(codeDepartement.equals("30")) {
		res = "Gard";
	}
	else if(codeDepartement.equals("31")) {
		res = "Haute-Garonne";
	}
	else if(codeDepartement.equals("32")) {
		res = "Gers";
	}
	else if(codeDepartement.equals("33")) {
		res = "Gironde";
	}
	else if(codeDepartement.equals("34")) {
		res = "Hérault";
	}
	else if(codeDepartement.equals("35")) {
		res = "Ille-et-Vilaine";
	}
	else if(codeDepartement.equals("36")) {
		res = "Indre";
	}
	else if(codeDepartement.equals("37")) {
		res = "Indre-et-Loire";
	}
	else if(codeDepartement.equals("38")) {
		res = "Isère";
	}
	else if(codeDepartement.equals("39")) {
		res = "Jura";
	}
	else if(codeDepartement.equals("40")) {
		res = "Landes";
	}
	else if(codeDepartement.equals("41")) {
		res = "Loir-et-Cher";
	}
	else if(codeDepartement.equals("42")) {
		res = "Loire";
	}
	else if(codeDepartement.equals("43")) {
		res = "Haute-Loire";
	}
	else if(codeDepartement.equals("44")) {
		res = "Loire-Atlantique";
	}
	else if(codeDepartement.equals("45")) {
		res = "Loiret";
	}
	else if(codeDepartement.equals("46")) {
		res = "Lot";
	}
	else if(codeDepartement.equals("47")) {
		res = "Lot-et-Garonne";
	}
	else if(codeDepartement.equals("48")) {
		res = "Lozère";
	}
	else if(codeDepartement.equals("49")) {
		res = "Maine-et-Loire";
	}
	else if(codeDepartement.equals("50")) {
		res = "Manche";
	}
	else if(codeDepartement.equals("51")) {
		res = "Marne";
	}
	else if(codeDepartement.equals("52")) {
		res = "Haute-Marne";
	}
	else if(codeDepartement.equals("53")) {
		res = "Mayenne";
	}
	else if(codeDepartement.equals("54")) {
		res = "Meurthe-et-Moselle";
	}
	else if(codeDepartement.equals("55")) {
		res = "Meuse";
	}
	else if(codeDepartement.equals("56")) {
		res = "Morbihan";
	}
	else if(codeDepartement.equals("57")) {
		res = "Moselle";
	}
	else if(codeDepartement.equals("58")) {
		res = "Nièvre";
	}
	else if(codeDepartement.equals("59")) {
		res = "Nord";
	}
	else if(codeDepartement.equals("60")) {
		res = "Oise";
	}
	else if(codeDepartement.equals("61")) {
		res = "Orne";
	}
	else if(codeDepartement.equals("62")) {
		res = "Pas-de-Calais";
	}
	else if(codeDepartement.equals("63")) {
		res = "Puy-de-Dôme";
	}
	else if(codeDepartement.equals("64")) {
		res = "Pyrénées-Atlantiques";
	}
	else if(codeDepartement.equals("65")) {
		res = "Hautes-Pyrénées";
	}
	else if(codeDepartement.equals("66")) {
		res = "Pyrénées-Orientales";
	}
	else if(codeDepartement.equals("67")) {
		res = "Bas-Rhin";
	}
	else if(codeDepartement.equals("68")) {
		res = "Haut-Rhin";
	}
	else if(codeDepartement.equals("69")) {
		res = "Rhône";
	}
	else if(codeDepartement.equals("70")) {
		res = "Haute-Saône";
	}
	else if(codeDepartement.equals("71")) {
		res = "Saône-et-Loire";
	}
	else if(codeDepartement.equals("72")) {
		res = "Sarthe";
	}
	else if(codeDepartement.equals("73")) {
		res = "Savoie";
	}
	else if(codeDepartement.equals("74")) {
		res = "Haute-Savoie";
	}
	else if(codeDepartement.equals("75")) {
		res = "Paris";
	}
	else if(codeDepartement.equals("76")) {
		res = "Seine-Maritime";
	}
	else if(codeDepartement.equals("77")) {
		res = "Seine-et-Marne";
	}
	else if(codeDepartement.equals("78")) {
		res = "Yvelines";
	}
	else if(codeDepartement.equals("79")) {
		res = "Deux-Sèvres";
	}
	else if(codeDepartement.equals("80")) {
		res = "Somme";
	}
	else if(codeDepartement.equals("81")) {
		res = "Tarn";
	}
	else if(codeDepartement.equals("82")) {
		res = "Tarn-et-Garonne";
	}
	else if(codeDepartement.equals("83")) {
		res = "Var";
	}
	else if(codeDepartement.equals("84")) {
		res = "Vaucluse";
	}
	else if(codeDepartement.equals("85")) {
		res = "Vendée";
	}
	else if(codeDepartement.equals("86")) {
		res = "Vienne";
	}
	else if(codeDepartement.equals("87")) {
		res = "Haute-Vienne";
	}
	else if(codeDepartement.equals("88")) {
		res = "Vosges";
	}
	else if(codeDepartement.equals("89")) {
		res = "Yonne";
	}
	else if(codeDepartement.equals("90")) {
		res = "Territoire de Belfort";
	}
	else if(codeDepartement.equals("91")) {
		res = "Essonne";
	}
	else if(codeDepartement.equals("92")) {
		res = "Hauts-de-Seine";
	}
	else if(codeDepartement.equals("93")) {
		res = "Seine-Saint-Denis";
	}
	else if(codeDepartement.equals("94")) {
		res = "Val-de-Marne";
	}
	else if(codeDepartement.equals("95")) {
		res = "Val-d'Oise";
	}
	else if(codeDepartement.equals("971")) {
		res = "Guadeloupe";
	}
	else if(codeDepartement.equals("972")) {
		res = "Martinique";
	}
	else if(codeDepartement.equals("973")) {
		res = "Guyane";
	}
	else if(codeDepartement.equals("974")) {
		res = "La Réunion";
	}
	else if(codeDepartement.equals("976")) {
		res = "Mayotte";
	}
		return res;
	}
	
	@Override
	public int compare(Departement o1, Departement o2) {
		// TODO Auto-generated method stub
		int res = 0;
		if(o1.getPopulation() > o2.getPopulation()) {
			res = -1;
		}
		else if(o1.getPopulation() < o2.getPopulation()) {
			res = 1;
		}
		else if(o1.getPopulation() == o2.getPopulation()) {
			res = 0;
		}
		return res;
	}
}
