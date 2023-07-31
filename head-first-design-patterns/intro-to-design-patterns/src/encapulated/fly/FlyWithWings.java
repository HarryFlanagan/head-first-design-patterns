package encapulated.fly;

import encapulated.fly.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        //Flying behavior implementation for ducks that DO fly...

        System.out.println("I'm flying");
    }
}
