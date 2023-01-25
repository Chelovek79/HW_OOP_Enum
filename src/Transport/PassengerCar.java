package Transport;

import Check.Check;
import Drivers.Driver_B;

public class PassengerCar<T extends Driver_B> extends Transport implements Competing {

    private double engineVolume;
    private T driver;

    public PassengerCar(String brand, String model, double engineVolume, T driver) {
        super(brand, model);
        this.engineVolume = Check.chekingengineVolume(engineVolume, 1.5);
        this.driver = driver;
    }

    public PassengerCar(){}

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Check.chekingengineVolume(engineVolume, 1.5);
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
