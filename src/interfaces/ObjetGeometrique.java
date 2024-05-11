package interfaces;
/**
 * Liste des methodes obligatoire que doit posseder un objet geometrique
 * @author DIGINAMIC
 */
public interface ObjetGeometrique {
	/**
	 * retourne le perimetre d'une forme geometrique
	 * @return double
	 */
	double perimetre();
	/**
	 * retourne la surface d'une forme geometrique
	 * @return double
	 */
	double surface();
}
