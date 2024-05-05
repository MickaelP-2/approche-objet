package essais;
import java.util.Scanner;

//
import operations.Operations;
//
public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op1 = new Operations();//declaration d'un objet de la classe Operations pour acerder aux methodes de classe
		Scanner scan = new Scanner(System.in);//Pour permettre la saisie des nombres et du signe de l'operation;
		double num1=0.0,num2=0.0;
		
		char operateur = '\u0000';
		System.out.println("Entrer le premier nombre: ");
		num1 = scan.nextDouble();
		System.out.println("Entrer le second nombre: ");
		num2 = scan.nextDouble();
		System.out.println("Pour additionner: (+) 1");
		System.out.println("Pour additionner: (-) 2");
		System.out.println("Pour additionner: (*) 3");
		System.out.println("Pour additionner: (/) 4");
		int cas = scan.nextInt();
		switch(cas){
			case 1:{
				System.out.println("résultat: "+op1.calcul(num1, num2, '+'));
			}
			break;
			case 2:{
				System.out.println("résultat: "+op1.calcul(num1, num2, '-'));
			}
			break;
			case 3:{
				System.out.println("résultat: "+op1.calcul(num1, num2, '*'));	
			}
			break;
			case 4:{
				System.out.println("résultat: "+op1.calcul(num1, num2, '/'));
			}
			break;
			default:{
				System.out.println("Choix non pris en compte");
			}
			break;
		}//fin swicth()
	}

}
