package metier;

public class ScooterEssence extends Scooter {

	public ScooterEssence(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Scooter à essence de modèle " + modele + ", de couleur " + couleur + ", de puissance "
				+ puissance + ", et d'espace " + espace + ".");
	}

}
