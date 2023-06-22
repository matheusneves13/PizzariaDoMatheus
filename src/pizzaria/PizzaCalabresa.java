package pizzaria;

import cozinha.Ingrediente;
import cozinha.Pizza;

public class PizzaCalabresa extends Pizza {

	public PizzaCalabresa(Ingrediente ingrediente) {
		super(ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void criar() {
		System.out.println("Criando uma pizza de calabresa!");
		ingrediente.add();
	}

}
