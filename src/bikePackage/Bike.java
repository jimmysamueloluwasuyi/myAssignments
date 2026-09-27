package bikePackage;

public class Bike {

    private boolean power;
    private int speed;

    public boolean isOn() {
        return power;
    }

    public void turnOn() {
        power = true;

    }

    public void turnOff() {
        power = false;

    }

    public void accelerate() {
        if (speed >= 0 && speed <= 20)
            speed += 1;
        else if (speed >= 20 && speed <= 30)
            speed += 2;
        else if (speed >= 31 && speed <= 40)
            speed += 3;
        else if (speed >= 41)
            speed += 4;

    }

    public int checkSpeed() {
        return speed;
    }

    public void decelerate() {
        if (speed >= 0 && speed <= 20)
            speed -= 1;
        else if (speed >= 20 && speed <= 30)
            speed -= 2;
        else if (speed >= 31 && speed <= 40)
            speed -= 3;
        else if (speed >= 41)
            speed -= 4;

    }
}
