package Check;

public class Check {

    public static String checkingString(String value, String otherValue) {
        if (value == null || value.isBlank()) {
            return otherValue;
        } else {
            return value;
        }
    }
    public static double chekingengineVolume(double value, double otherValue) {
        if (value <= 0) {
            return otherValue;
        } else {
            return value;
        }
    }
}
