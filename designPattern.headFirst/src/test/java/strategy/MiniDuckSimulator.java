package strategy;

import org.junit.Test;

import strategy.duck.Duck;
import strategy.duck.FlyRocketPowered;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDock;



public class MiniDuckSimulator {

	@Test
	public void test() {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDock();

		model.performFly();
		model.performQuack();

		model.setFlyBehavior(new FlyRocketPowered());

		model.performFly();
	}

}
