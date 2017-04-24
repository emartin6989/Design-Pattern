package metier;

public class ScooterElectrique extends Scooter {
	
	public ScooterElectrique(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Scooter électrique de modèle " + modele + ", de couleur " + couleur + ", de puissance "
				+ puissance + ", et d'espace " + espace + ".");
	}

}
