package factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {

		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		}

		return null;
	}

}
