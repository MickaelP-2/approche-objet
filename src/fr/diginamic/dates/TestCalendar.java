package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Calendar calend = Calendar.getInstance();
		//creer une instance de calendar en date du 19 mai 2016 a 23h59 30s
		calend.set(Calendar.YEAR, 2016);
		calend.set(Calendar.MONTH, 4);
		calend.set(Calendar.DAY_OF_MONTH, 19);
		calend.set(Calendar.HOUR_OF_DAY, 23);
		calend.set(Calendar.MINUTE, 59);
		calend.set(Calendar.SECOND, 30);
		//afficher l'instance au format: yyyy/MM/dd HH:mm:ss
		SimpleDateFormat formateur = new SimpleDateFormat("yyyy'/'MM'/'dd HH':'mm':'ss");
		Date d = calend.getTime();
		System.out.println(formateur.format(d).toString());
		//afficher avec des locale : francais, russe,chinois, allemand
		//formateur = new SimpleDateFormat("yyyy'/'MM'/'dd HH':'mm':'ss \n EEEE MMMM",Locale.FRANCE);
		formateur = new SimpleDateFormat("EEEE dd MMMM MM yyyy HH':'mm':'ss ",Locale.FRANCE);
		System.out.println(formateur.format(d).toString());
		//formateur = new SimpleDateFormat("yyyy'/'MM'/'dd HH':'mm':'ss \n EEEE MMMM",new Locale("ru","RU"));
		formateur = new SimpleDateFormat("EEEE dd MMMM MM yyyy HH':'mm':'ss ",new Locale("ru","RU"));
		System.out.println(formateur.format(d).toString());
		//formateur = new SimpleDateFormat("yyyy'/'MM'/'dd HH':'mm':'ss \n EEEE MMMM",Locale.SIMPLIFIED_CHINESE);
		formateur = new SimpleDateFormat("EEEE dd MMMM MM yyyy HH':'mm':'ss ",Locale.SIMPLIFIED_CHINESE);
		System.out.println(formateur.format(d).toString());
		//formateur = new SimpleDateFormat("yyyy'/'MM'/'dd HH':'mm':'ss \n EEEE MMMM",Locale.GERMANY);
		formateur = new SimpleDateFormat("EEEE dd MMMM MM yyyy HH':'mm':'ss ",Locale.GERMANY);
		System.out.println(formateur.format(d).toString());
	}

}
