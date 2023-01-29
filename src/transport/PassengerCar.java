package transport;

import drivers.DriverB;
import check.Check;

public class PassengerCar<T extends DriverB> extends Transport implements Competing {

    enum CarBody {
        a ("Седан"),
        b ("Хэтчбек"),
        c ("Купе"),
        d ("Универсал"),
        e ("Внедорожник"),
        f ("Кроссовер"),
        g ("Пикап"),
        h ("Фургон"),
        i ("Минивен");

        final String bodyName;

        CarBody (String bodyName) {
            this.bodyName = bodyName;
        }

        @Override
        public String toString() {
            return "Тип кузова - " + CarBody.this.bodyName;
        }
    }

    private double engineVolume;
    private T driver;

    public PassengerCar(String brand, String model, double engineVolume, T driver) {
        super(brand, model);
        this.engineVolume = Check.checkingEngineVolume(engineVolume, 1.5);
        this.driver = driver;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Check.checkingEngineVolume(engineVolume, 1.5);
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return super.toString() + ". Объём двигателя " + engineVolume + " " + driver;
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
