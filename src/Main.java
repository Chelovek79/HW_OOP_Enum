import Drivers.*;
import Transport.*;

public class Main {

    public static void main(String[] args) {

        DB_Transport transport = new DB_Transport();
        transport.getDriverCarNameC(0);
        transport.getDriverCarNameD(2);
        System.out.println(" ");

        Driver drivers = new Driver_B();
        Transport sporttrasport = new Transport();
        Competing competing = new PassengerCar <> ();

        transport.getDriverCarNameB(1);
        drivers.startDriving();
        competing.bestTimeLap("5m 36sec");
        competing.maxSpeed(184);
        competing.pit_stop();
        drivers.refuel();
        sporttrasport.startMoving();
        drivers.stopDriving();
        System.out.println("Финиш");

    }
}