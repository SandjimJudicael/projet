/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

/**
 *
 * @author WIN
 */
public class Personnel {
    	private final Employe[] tableau;
	private int nbEmploye;
	private final static int MAXIEMPLOYE = 5000;

	public Personnel() {
		tableau = new Employe[MAXIEMPLOYE];
		nbEmploye = 0;
	}

	public void ajouterEmploye(Employe e) {
		++nbEmploye;
		if (nbEmploye <= MAXIEMPLOYE) {
			tableau[nbEmploye - 1] = e;
		} else {
			System.out.println("Pas plus de " + MAXIEMPLOYE + " employés");
		}
	}

	public double salaireMoyen() {
		double somme = 0.0;
		for (int i = 0; i < nbEmploye; i++) {
			somme += tableau[i].calculerSalaire();
		}
		return somme / nbEmploye;
	}

	public void afficherSalaires() {
		for (int i = 0; i < nbEmploye; i++) {
			System.out.println(tableau[i].getNom() + " gagne "
					+ tableau[i].calculerSalaire() + " francs.");
		}
	}
}
