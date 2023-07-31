package client.duck;

import encapulated.fly.FlyNoWay;
import encapulated.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

}
