import drivers.*;
import transport.*;

public class Main {

    public static void main(String[] args) {

        DbTransport transport = new DbTransport();
        DbDrivers drivers = new DbDrivers();

        transport.getDriverCarName(0, "C");
        transport.getDriverCarName(2, "D");
        System.out.println(" ");

        transport.getDriverCarName(1, "B");
        drivers.getStartDrivingB(1);
        transport.getDriverBbestLap(1, "5m 36sec");
        drivers.getRefuelB(1);
        Transport.startMoving();
        drivers.getStopB(1);
        System.out.println("Финиш \n");

        transport.printType(2, "B");
        transport.printType(0, "C");
        transport.printType(3, "D");

    }
}