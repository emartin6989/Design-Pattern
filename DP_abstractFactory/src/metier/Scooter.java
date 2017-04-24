package metier;

public abstract class Scooter {
	protected String modele;
	protected String couleur;
	protected int puissance;
	protected double espace;

	public Scooter(String modele, String couleur, int puissance, double espace) {
		super();
		this.modele = modele;
		this.couleur = couleur;
		this.puissance = puissance;
		this.espace = espace;
	}

	public abstract void afficheCaracteristiques();
}
