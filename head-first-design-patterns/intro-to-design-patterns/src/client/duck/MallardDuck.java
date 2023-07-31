package client.duck;

import encapulated.fly.FlyNoWay;
import encapulated.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

}
