package pizzaria;

import cozinha.Ingrediente;
import cozinha.Pizza;

public class PizzaFrangoMilho extends Pizza {

	public PizzaFrangoMilho(Ingrediente ingrediente) {
		super(ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void criar() {
		System.out.println("Criando uma pizza de Frango e milho!");
		ingrediente.add();
	}

}
