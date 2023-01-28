package transport;

import drivers.DbDrivers;

public class DbTransport {

    DbDrivers dbDrivers = new DbDrivers();

    PassengerCar <?> [] smallcar = {new PassengerCar<> ("Toyota", "Chaser", 3.0, dbDrivers.getDriverB(0)),
            new PassengerCar<>("BMW", "750iL", 5.4, dbDrivers.getDriverB(2)),
            new PassengerCar<>(" ", "Калина",1.5, dbDrivers.getDriverB(1)),
            new PassengerCar<>("ЗАЗ", "1.2 MT 968M", 1.2,dbDrivers.getDriverB(0)) };

    Trucks <?> [] trucks = {new Trucks<>("КамАЗ", "43118", 10.85, dbDrivers.getDriverC(1)),
            new Trucks<>("ЗИЛ", "131", 6.96, dbDrivers.getDriverC(0)),
            new Trucks<>("Урал", null, 6.6, dbDrivers.getDriverC(2)),
            new Trucks<>("ГАЗ", "66", 0, dbDrivers.getDriverC(1)) };

    Bus <?> [] buses = {new Bus<>("Ikarus", "250 SL", 10.4, dbDrivers.getDriverD(1)),
            new Bus<>("ЛиАЗ", "677", 6.96, dbDrivers.getDriverD(0)),
            new Bus<>("ЛАЗ", "695Н", 6.0, dbDrivers.getDriverD(2)),
            new Bus<>("VolgaBus", "Серпантин-10", 8.4, dbDrivers.getDriverD(2)) };


    public void getDriverCarNameB(int i) {
        System.out.println("Водитель " + dbDrivers.getNameDriverB(i) + " управляет автомобилем " + smallcar[i].getBrand()
                + " " + smallcar[i].getModel() + " и будет участвовать в заезде 'легковых машин'.");
    }

    public void getDriverCarNameC(int i) {
        System.out.println("Водитель " + dbDrivers.getNameDriverC(i) + " управляет автомобилем " +  trucks[i].getBrand()
                + " " + trucks[i].getModel() + " и будет участвовать в заезде 'грузовых машин'.");
    }

    public void getDriverCarNameD(int i) {
        System.out.println("Водитель " + dbDrivers.getNameDriverD(i) + " управляет автобусом " +  buses[i].getBrand()
                + " " + buses[i].getModel() + " и будет участвовать в заезде 'автобусов'.");
    }

    public void getDriverBbestLap (int i, String time) {
        System.out.print(dbDrivers.getNameDriverB(i) + " ");
        smallcar[i].bestTimeLap(time);
    }

}
