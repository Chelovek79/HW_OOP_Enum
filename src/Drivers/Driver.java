package Drivers;

public class Driver {

    private final String FIO;
    private boolean driversLicense;
    private double workExperience;

    public Driver() {
        FIO = null;
    }

    public Driver(String FIO, boolean driversLicense, double workExperience) {
        this.FIO = FIO;
        this.driversLicense = driversLicense;
        this.workExperience = workExperience;
    }

    public void startDriving() {}
    public void stopDriving() {}
    public void refuel() {}

    public String getFIO() {
        return FIO;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return FIO + " Водительский стаж " + workExperience + ".";
    }
}
