package airConditioner;

public class AirConditioner {

    private boolean powerState;
    private int temperature;

    public boolean isOn() {
        return powerState;
    }

    public void turnOn() {
        powerState = true;
        temperature = 16;

    }

    public void turnOff() {
        powerState = false;

    }

    public int checkTemperature() {
        return temperature;

    }

    public void increase() {
        if (temperature < 30)
            temperature += 1;
    }

    public void decrease() {
        if (temperature > 16)
            temperature -= 1;
    }
}
