package metier;

public class Leurre extends Canard {

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("Je suis un leurre");
	}

	public Leurre() {
		super();
		comportementCancaner = new CancanerMuet();
		comportementVol = new VolerAvecDesAiles();
	}
	
	

}
