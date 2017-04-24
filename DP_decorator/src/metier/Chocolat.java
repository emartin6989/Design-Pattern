package metier;

public class Chocolat extends DecoratorIngredient {

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription()+", Chocolat";
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 0.20+boisson.cout();
	}

}
