package operations;

public class Operations {
//
	public Operations(){
		//constructeur sans arguments
	}
	public double calcul(double a, double b, char operateur) {
		double res = 0.0;
		if(operateur=='+') {
			//System.out.println("a: "+a+" b: "+b+" "+operateur);
			res = (a + b);
		}
		else if(operateur=='-') {
			//System.out.println("a: "+a+" b: "+b+" "+operateur);
			res = (a - b);
		}
		else if(operateur=='*') {
			//System.out.println("a: "+a+" b: "+b+" "+operateur);
			res = (a * b);
		}
		else if(operateur=='/') {
			//System.out.println("a: "+a+" b: "+b+" "+operateur);
			if (b==0) {
				//division par 0
				res=0;
			}
			else res = a/b;
		}
		return res;
	}
}
