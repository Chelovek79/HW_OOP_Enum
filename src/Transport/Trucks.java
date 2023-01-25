package Transport;

import Check.Check;
import Drivers.Driver_C;

public class Trucks<T extends Driver_C> extends Transport implements Competing {

    private double engineVolume;
    private T driver;

    public Trucks(String brand, String model, double engineVolume, T driver) {
        super(brand, model);
        this.engineVolume = Check.chekingengineVolume(engineVolume, 10.0);
        this.driver = driver;
    }

    public Trucks () {}

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Check.chekingengineVolume(engineVolume, 10.0);
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return super.toString() +  ". Объём двигателя " + engineVolume + " " + driver;
    }

    @Override
    public void pit_stop() {
        System.out.println("Пит-стоп...");
    }

    @Override
    public void bestTimeLap(String timeLap) {
        System.out.println("Лучшее время проезда круга " + timeLap);
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость - " + speed + " км/ч");
    }
}
