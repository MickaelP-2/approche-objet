package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string_num = "17";
		int num = Integer.parseInt(string_num);//conversion de type string en type Int
		System.out.println("num: "+num);
		int a=1,b=7;
		//Integer.compare(x,y)la fonction compare renvoie 0 si les valeurs sont égales, -1 si la secondes est supérieure et 1 si la premiere est supérieure
		System.out.println("?? "+Integer.compare(a,b));
		int res = Integer.compare(a, b);
		if(res==0) {
			System.out.println("a == b");
		}
		else if(res<0) {
			System.out.println("a < b");
		}
		else if(res>0) {
			System.out.println("a > b");
		}
	}

}
