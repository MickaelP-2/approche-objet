package annotations;

import java.lang.reflect.Field;
//import java.lang.annotation.;

public class TestPays {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		Pays pays1 = new Pays("Allemagne","83 408 554","50 206");
		System.out.println(pays1.toString());
		
		Pays pays2 = new Pays("chine","1 425 893 465","16 624");
		System.out.println(pays2.toString());
		
		
		Class<?> classe = pays2.getClass();
		Field[] fields = classe.getDeclaredFields();
		String str = null;
		for(Field f : fields) {
			f.setAccessible(true);
			if(f.isAnnotationPresent(ToString.class)) {
				System.out.println("annotation Ok pour nom");
				System.out.println("nom attribut: "+f.getName());//pour le nom de l'attribut
				System.out.println("valeur attribut: "+f.get(pays2));//Pour la valeur de l'attribut
				str = str+f.get(pays2);
				//System.out.print("f: "+f.toString());
			}
			
		}
		//@ToString()
		System.out.println("str: "+str);	
		
	}
}
