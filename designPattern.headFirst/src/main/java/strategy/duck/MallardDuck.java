package strategy.duck;

import strategy.behavior.FlyWithWings;
import strategy.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
}
