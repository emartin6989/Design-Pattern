package metier;

public class CanardPlastique extends Canard {

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("Je suis un canard en plastique");
	}

	public CanardPlastique() {
		super();
		comportementCancaner = new CoinCoin();
		comportementVol = new NePasVoler();
	}
	
	

}
