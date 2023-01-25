package Drivers;

public class Driver_C extends Driver {

    public Driver_C(String FIO, boolean driversLicense, double workExperience) {
        super(FIO, driversLicense, workExperience);
    }

    public Driver_C () {}

    @Override
    public void startDriving() {
        System.out.println("Тронулись...");
    }

    @Override
    public void stopDriving() {
        System.out.println("Докатились...");
    }

    @Override
    public void refuel() {
        System.out.println("Заливаю топливо...");
    }

    @Override
    public String toString() {
        return super.toString() + " Категория - 'C'." ;
    }
}
