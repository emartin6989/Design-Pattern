package metier;

public abstract class Scooter extends Vehicule {
	
	public Scooter(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
		// TODO Auto-generated constructor stub
	}

	public abstract void afficheCaracteristiques();
}
