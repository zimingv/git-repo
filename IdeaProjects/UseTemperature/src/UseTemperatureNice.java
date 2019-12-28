public class UseTemperatureNice {
    public static void main(String[] args) {

        TemperatureNice temp = new TemperatureNice();
        temp.setNumber(30.0);
        temp.setScale(TempScale.CELSIUS);
        temp.display();

        temp = new TemperatureNice(18.0);
        temp.display();

        temp = new TemperatureNice(TempScale.CELSIUS);
        temp.display();

        temp = new TemperatureNice(10.0, TempScale.KELVIN);
        temp.display();
    }
}
