package nowe;

public class TrafficLight {
    private int currentLight;

    public TrafficLight() {
        currentLight = 0;
    }

    public int getLight() {
        return currentLight;
    }

    public void changeLight() {
        if (currentLight == 0) {
            currentLight = 1;
        } else if (currentLight == 1) {
            currentLight = 2;
        } else {
            currentLight = 0;
        }
    }
}