package presentation;

import metier.Automobile;
import metier.Scooter;
import service.FabriqueVehicule;
import service.FabriqueVehiculeElectrique;
import service.FabriqueVehiculeEssence;

public class Lanceur {

	public static void main(String[] args) {
		
		FabriqueVehicule f1 =new FabriqueVehiculeEssence();
		FabriqueVehicule f2=new FabriqueVehiculeElectrique();
		
		Automobile autoess= f1.creeAutomobile("mercedes", "grise", 250, 180);
		
		Automobile autoelec= f2.creeAutomobile("bmw", "rouge", 230, 190);
		
		autoess.afficheCaracteristiques();
		autoelec.afficheCaracteristiques();
		
		Scooter scootess=f1.creeScooter("hyamaha", "verte", 150, 100);
		Scooter scootelec=f2.creeScooter("kawasaki", "orange", 200, 90);
		
		scootess.afficheCaracteristiques();
		scootelec.afficheCaracteristiques();

	}

}
