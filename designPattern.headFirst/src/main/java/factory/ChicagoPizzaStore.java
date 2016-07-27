package factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {

		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}

		return null;
	}

}
