package encapulated.quack;

import encapulated.quack.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeek");
    }
}
