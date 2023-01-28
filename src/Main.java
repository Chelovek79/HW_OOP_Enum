import drivers.*;
import transport.*;

public class Main {

    public static void main(String[] args) {

        DbTransport transport = new DbTransport();
        DbDrivers drivers = new DbDrivers();

        transport.getDriverCarNameC(0);
        transport.getDriverCarNameD(2);
        System.out.println(" ");

        transport.getDriverCarNameB(1);
        drivers.getStartDrivingB(1);
        transport.getDriverBbestLap(1, "5m 36sec");
        drivers.getRefuelB(1);
        Transport.startMoving();
        drivers.getStopB(1);
        System.out.println("Финиш");

    }
}