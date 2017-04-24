package presentation;

import metier.Canard;
import metier.CanardPlastique;
import metier.Colvert;
import metier.Leurre;

public class Lanceur {

	public Lanceur() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Canard col = new Colvert();
		Canard leu = new Leurre();
		Canard pla = new CanardPlastique();
		
		col.afficher();
		col.nager();
		col.effectuerCancaner();
		col.effectuerVol();
		System.out.println("---------------------------------------------------------");
		leu.afficher();
		leu.nager();
		leu.effectuerCancaner();
		leu.effectuerVol();
		System.out.println("---------------------------------------------------------");
		pla.afficher();
		pla.nager();
		pla.effectuerCancaner();
		pla.effectuerVol();
		System.out.println("---------------------------------------------------------");
	}

}
