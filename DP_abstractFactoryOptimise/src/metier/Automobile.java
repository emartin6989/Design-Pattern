package metier;

public abstract class Automobile extends Vehicule {
	
	public Automobile(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
		// TODO Auto-generated constructor stub
	}

	public abstract void afficheCaracteristiques();
	
}
