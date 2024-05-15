package fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//créer une instance de date a la date du jour
		Date date = new Date();
		System.out.println("date: "+date.toString());
		//Calendar calend = Calendar.getInstance();
		//créer une instance de date au : 19/05/2016 à 23h59 
		//calend.set(2016,4,19,23,59,30);
		Date date2 = new Date((2016-1900),4,19,23,59,30) ;
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println("date: "+formateur.format(date).toString());
		formateur = new SimpleDateFormat("YYYY/MM/dd HH:MM:SS");
		//formateur = new SimpleDateFormat("YYYY/MM/dd HH'h'MM'min' SS's'");=OK
		System.out.println("date: "+formateur.format(date2).toString());
		//créer une instance de date contenant date/heure affiché au meme format
		
	}

}
