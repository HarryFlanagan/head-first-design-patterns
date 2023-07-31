package interfaces;

public interface Observer {

    // The Observer interface is implemented by all observers, so they all have to implement the update() method.
    // Here we're passing the measurement to the observer.

    public void update(float temp, float humidity, float pressure);
    // These are the state values the Observers get from the Subject when a weather measurement changes.
}
