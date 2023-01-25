package Drivers;

public class Driver_D extends Driver {

    public Driver_D(String FIO, boolean driversLicense, double workExperience) {
        super(FIO, driversLicense, workExperience);
    }

    public Driver_D () {}

    @Override
    public void startDriving() {
        System.out.println("Полетели...");
    }

    @Override
    public void stopDriving() {
        System.out.println("Остановка...");
    }

    @Override
    public void refuel() {
        System.out.println("Заправка...");
    }

    @Override
    public String toString() {
        return super.toString() + " Категория - 'D'." ;
    }
}
