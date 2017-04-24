package metier;

public abstract class Vehicule {
	protected String modele;
	protected String couleur;
	protected int puissance;
	protected double espace;
	
	public Vehicule(String modele, String couleur, int puissance, double espace) {
		super();
		this.modele = modele;
		this.couleur = couleur;
		this.puissance = puissance;
		this.espace = espace;
	}
	
	
}
