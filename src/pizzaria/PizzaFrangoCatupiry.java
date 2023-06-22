package pizzaria;

import cozinha.Ingrediente;
import cozinha.Pizza;

public class PizzaFrangoCatupiry extends Pizza {

	public PizzaFrangoCatupiry(Ingrediente ingrediente) {
		super(ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void criar() {
		System.out.println("Criando uma pizza de Frango e catupiry!");
		ingrediente.add();
	}

}
