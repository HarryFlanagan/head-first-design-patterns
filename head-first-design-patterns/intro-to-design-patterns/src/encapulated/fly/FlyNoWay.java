package encapulated.fly;

import encapulated.fly.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        // Flying behavior implementation for ducks that do NOT fly (like rubber ducks and decoy ducks)

        System.out.println("I can't fly");
    }
}
