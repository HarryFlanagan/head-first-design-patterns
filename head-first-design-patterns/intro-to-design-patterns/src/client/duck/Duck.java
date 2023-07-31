package client.duck;

import encapulated.fly.behavior.FlyBehavior;
import encapulated.quack.behavior.QuackBehavior;

public abstract class Duck {

    /**
     * Declare two reference variables for the behavior interface types.
     * All duck subclasses (in the same package) inherit these.
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    /**
     * Delegate to the behavior class.
     */
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, event decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
