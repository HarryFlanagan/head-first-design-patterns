package main;

import client.duck.Duck;
import client.duck.MallardDuck;
import client.duck.ModelDuck;
import client.duck.RubberDuck;
import encapulated.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] arg) {
        
        System.out.println("-- Mallard Duck --");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println();

        System.out.println("-- Model Duck --");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println();

        System.out.println("-- Rubber Duck --");
        Duck rubber = new RubberDuck();
        rubber.performQuack();
        rubber.performFly();
        System.out.println();
    }
}
