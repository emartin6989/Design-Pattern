package metier;

public class Colvert extends Canard {

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("Je suis un canard Colvert");
	}

	public Colvert() {
		super();
		comportementCancaner = new Cancaner();
		comportementVol = new VolerAvecDesAiles();
	}
	
	

}
