public class UseTemperature {
    public static void main(String[] args) {
        final String format = "%5.2f градусов по %s\n";

        Temperature temp = new Temperature();
                temp.setNumber(30.0);
                temp.setScale(TempScale.CELSIUS);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(18.0);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(TempScale.CELSIUS);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(10.0, TempScale.KELVIN);
        System.out.printf(format, temp.getNumber(), temp.getScale());
    }
}
