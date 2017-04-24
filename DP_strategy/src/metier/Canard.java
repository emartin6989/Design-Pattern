package metier;

public abstract class Canard {

	protected ComportementVol comportementVol;
	protected ComportementCancaner comportementCancaner;

	public abstract void afficher();

	public void nager() {
		System.out.println("Je nage");
	}

	public void effectuerCancaner() {
		comportementCancaner.cancaner();
	}

	public void effectuerVol() {
		comportementVol.voler();
	}

	public ComportementVol getComportementVol() {
		return comportementVol;
	}

	public void setComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}

	public ComportementCancaner getComportementCancaner() {
		return comportementCancaner;
	}

	public void setComportementCancaner(ComportementCancaner comportementCancaner) {
		this.comportementCancaner = comportementCancaner;
	}

}
