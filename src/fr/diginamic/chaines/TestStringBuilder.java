package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder bstring = new StringBuilder();
		long debut = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			bstring.append(i);
		}
		System.out.println(bstring.toString());
		long fin = System.currentTimeMillis();
		long duree = (fin-debut);
		System.out.println("Builder duree: "+duree+" ms.");//13 ms
		debut = System.currentTimeMillis();
		String str = null;
		for(int i=0;i<100000;i++) {
			str = str+i;// str +=i;
		}
		System.out.println(str);
		fin = System.currentTimeMillis();
		duree = (fin-debut);
		System.out.println("String duree: "+duree+" ms.");//4800 ms
	}

}
