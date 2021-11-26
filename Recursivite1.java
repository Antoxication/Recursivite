/*
 * Recurisivite1.java											  novembre 2021
 * INFO 2, pas de copyright, aucun droit
 */

/**
 * première partie sur la récurisivité
 * ensemble de méthodes autour : 
 * - de la suite de Fibonnacci
 * - du calcul de la valeur du terme d'un certain rang,
 * - du calcul du produit de 2 entiers sans utiliser l'opérateur multiplication,
 * - de l'étude de figures géométriques,
 * - des traitements sur les tableaux d'entiers
 * et un programme mystère !!!
 */
public class Recursivite1 {

	/**
	 * calcule la valeur du terme de rang n
	 * @return 
	 */
	public static int fibonacci(int rang) {

		/** 
		 * la suite de Fibonnaci est définie comme suit :
		 * U0 = 1
		 * U1 = 1
		 * Un = Un-1 + Un-2 pour n >= 2
         */
		
		/* demande à l'utilisateur de saisir un certain rang n afin
		 * de le caculer
		 */
		//@SuppressWarnings("resource")
		//Scanner entree = new Scanner(System.in);
		//do {
		//System.out.println("veuillez saisir un entier positif correspondant"
		//	+ " à un certain rang de la suite de Fibonnacci : ");
		//boolean estEntier = entree.hasNextInt();
		//rang = estEntier ? entree.nextInt() : -1;
		//if (rang <= 0) {
		//	rang = -1;
		//}
		//entree.nextLine();
		//} while (rang == -1);

		if (rang < 0) {
			return (int) Double.NaN;
		}
		if (rang == 0 || rang == 1) {
			return 1;
		}
		return fibonacci(rang-1) + fibonacci(rang-2);
		//0 1 1 2 3 5 8 13 21 34 55 89
		/**
		 * fibo(4) = fibo(3) + fibo(2) 
		 *         = fibo(2) + fibo(1)
		 *         = fibo(1) + 1
		 *         = 1       + 1
		 */


	}
}
