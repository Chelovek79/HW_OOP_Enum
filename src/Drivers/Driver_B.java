package Drivers;

public class Driver_B extends Driver {

    public Driver_B(String FIO, boolean driversLicense, double workExperience) {
        super(FIO, driversLicense, workExperience);
    }

    public Driver_B() {}

    @Override
    public void startDriving() {
        System.out.println("Он сказал поехали и махнул рукой...");
    }

    @Override
    public void stopDriving() {
        System.out.println("Стоп. Приехали...");
    }

    @Override
    public void refuel() {
        System.out.println("Заправляем...");
    }

    @Override
    public String toString() {
        return super.toString() + " Категория - 'B'." ;
    }


}
