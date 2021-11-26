/*
 * Recursivite1Tests.java										  novembre 2021
 * INFO 2, pas de copyright, aucun droit
 */

/**
 * ensemble des méthode de tests pour les exercices portant sur la 
 * récusivité : suite de Fibonnacci, produit de 2 entiers, 
 * étude de figures géométriques, traitement sur les tableaux d'entiers
 * et problème mystère
 */
public class Recursivite1Tests {

	/**
	 * tableaux contenant des valeurs de rang corrects : nombres entiers
	 * positifs ou nuls
	 */
	public static final int[] RANGS_CORRECTS = {12, 15, 0, 1, 8, 22};

	/**
	 * tableau contenant les valeurs des résultats attendus 
	 * pour des rangs corrects : nombres entiers naturels
	 */
	public static final int[] RESULTATS_ATTENDUS_RANGS_CORRECTS 
	= {233,987,1,1,34,28657};

	/**
	 * tableau contenant des valeurs des résultats attendus
	 * pour des rangs incorrects : nombres entiers négatifs
	 */
	public static final int[] RESULTATS_ATTENDUS_RANGS_INCORRECTS 
	= new int[RANGS_CORRECTS.length];

	/**
	 * tableau contenant des valeurs de rang incorrects : 
	 * nombre entiers inférieurs à 0
	 */
	public static final int[] RANGS_INCORRECTS = {-9,-98,-48965,-1,-984561};

	/**
	 * méthode de test de la méthode de Fibonnacci
	 */
	public static void fibonnacciTest() {
		System.out.println("----------------------- test de la méthode Fibonnacci------------------------\n");

		/* test de la méthode de Fibonnacci avec seulement des rangs corrects */
		System.out.println("test des rangs corrects : ");

		/* 
		 * tableau des résultats obtenus en faisant subir la suite
		 * de Fibonacci à chaque rang du tableau de rangs corrects
		 */
		int[] resultatsObtenusRangsCorrects = new  int[RANGS_CORRECTS.length];

		/*
		 * remplissage du tableau des résultats obtenus en faisant subir à chaque
		 * indice du tableau des rangs corrects la suite de Fibonacci
		 */
		for (int i = 0 ; i < RANGS_CORRECTS.length ; i++) {
			resultatsObtenusRangsCorrects[i] = Recursivite1.fibonacci(RANGS_CORRECTS[i]);
			System.out.println("rang " + RANGS_CORRECTS[i] + " : " 
			+ Recursivite1.fibonacci(RANGS_CORRECTS[i]));
		}
		
		/* 
		 * création d'un booléen resultat pour mettre en mémoire
		 * les résultats des tests
		 */
		boolean resultat = true;
		for (int i = 0 ; i < resultatsObtenusRangsCorrects.length ; i++) {
			if (resultatsObtenusRangsCorrects[i] != RESULTATS_ATTENDUS_RANGS_CORRECTS[i]) {
				resultat = false;
			}
		}

		/* 
		 * on vérifie que tous les tests sont corrects afin d'en informer
		 * l'utilisateur
		 */
		System.out.println(resultat ? 
				"tous les tests pour des rangs corrects sont corrects !\n"
				: "parmi les tests pour des rangs corrects, il y a "
				+ "au moins une erreur\n");

		/* 
		 * test de la mérhode de Fibonacci avec seulement des rangs incorrects 
		 */
		System.out.println("test des rangs incorrects : ");
		
		/* 
		 * remplissage du tableau RESULTATS_ATTENDUS_RANGS_INCORRECTS
		 * car il fallait le remplir à l'intérieur de la méthode
		 */
		for (int i = 0 ; i < RANGS_INCORRECTS.length ; i++) {
			RESULTATS_ATTENDUS_RANGS_INCORRECTS[i] = (int) Double.NaN;
		}
		
		/* 
		 * tableau des résultats obtenus en faisant subir la suite
		 * de Fibonacci à chaque rang du tableau des rangs incorrects
		 */
		int[] resultatsObtenusRangsIncorrects = new  int[RANGS_INCORRECTS.length];

		/*
		 * remplissage du tableau des résultats obtenus en faisant subir à chaque
		 * indice du tableau des rangs incorrects la suite de Fibonacci
		 */
		for (int i = 0 ; i < RANGS_INCORRECTS.length ; i++) {
			resultatsObtenusRangsIncorrects[i] = Recursivite1.fibonacci(RANGS_INCORRECTS[i]);
			System.out.println("rang " + RANGS_INCORRECTS[i] + " : " 
			+ Recursivite1.fibonacci(RANGS_INCORRECTS[i]));
		}
		
		/* 
		 * création d'un booléen resultat pour mettre en mémoire
		 * les résultats des tests
		 */
		boolean resultat1 = true;
		for (int i = 0 ; i < resultatsObtenusRangsIncorrects.length ; i++) {
			if (resultatsObtenusRangsIncorrects[i] != RESULTATS_ATTENDUS_RANGS_INCORRECTS[i]) {
				resultat1 = false;
			}
		}
		
		/* 
		 * on vérifie que tous les tests sont corrects afin d'en informer
		 * l'utilisateur
		 */
		System.out.println(resultat1 ? 
				"tous les tests pour des rangs incorrects sont corrects !\n"
				: "parmi les tests pour des rangs incorrects, il y a "
				+ "au moins une erreur\n");
		
		System.out.println("----------------------- fin de test de la méthode Fibonnacci-----------------\n");
	}

	/**
	 * exécute les différentes méthodes de tests définies ci-dessus.
	 */
	public static void main(String[] args) {
		System.out.println("----------------------- début de la classe de tests ------------------------\n");
		fibonnacciTest();
		System.out.println("----------------------- fin de la calsse des tests -------------------------\n");
	}
}
