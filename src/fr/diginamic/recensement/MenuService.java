package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService {
	//1 methode 
	//recensement pour les données du fichier, Scanner pour données de la console(verif)
	public abstract void traiter(Recensement recensement, Scanner scanner);
}
