package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.Quack;

public class ModelDock extends Duck {

	public ModelDock() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
