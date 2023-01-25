package Drivers;

public class DB_Drivers {

    Driver_B [] driverB = {new Driver_B("Санников И.П.", true, 5.0),
            new Driver_B("Алексеев Ф.С.", true, 7.0),
            new Driver_B("Суровый В.И.", true, 15.5)};

    Driver_C [] driverC = {new Driver_C("Русанов Г.Л.", true, 7.5),
            new Driver_C("Прохин К.К.", true, 6.5),
            new Driver_C("Суровый В.И.", true, 15.5)};

    Driver_D [] driverD = {new Driver_D("Малышев О.С.", true, 7.5),
            new Driver_D("Васильев И.Д.", true, 6.5),
            new Driver_D("Суровый В.И.", true, 15.5)};


    public String getNameDriverB (int i) {
        return driverB[i].getFIO();
    }
    public String getNameDriverC (int i) { return driverC[i].getFIO(); }
    public String getNameDriverD (int i) { return driverD[i].getFIO(); }

    public Driver_B getDriverB (int i) {
        return driverB[i];
    }

    public Driver_C getDriverC (int i) {
        return driverC[i];
    }

    public Driver_D getDriverD (int i) {
        return driverD[i];
    }
}



