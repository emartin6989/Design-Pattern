package presentation;

import metier.Boisson;
import metier.Caramel;
import metier.Chocolat;
import metier.Colombia;
import metier.Expresso;

public class ApplicationDecorator {

	public static void main(String[] args) {
		Boisson expr = new Expresso();
		System.out.println(expr.getDescription() + " coût = " + expr.cout() + " €");

		Boisson col = new Colombia();
		col = new Caramel(col);
		col = new Chocolat(col);
		System.out.println(col.getDescription() + " coût = " + col.cout() + " €");
	}
}
