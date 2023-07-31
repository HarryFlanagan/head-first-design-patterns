package client.duck;

import encapulated.fly.FlyNoWay;
import encapulated.quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
}
