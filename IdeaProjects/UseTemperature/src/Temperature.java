public class Temperature {
    private double number;
    private TempScale scale;

    public Temperature() {
        number = 0.0;
        scale = TempScale.CELSIUS;
    }

    public Temperature(double number) {
        this.number = number;
        scale = TempScale.CELSIUS;
    }

    public Temperature(TempScale scale) {
        this.scale = scale;
        number = 0.0;
    }

    public Temperature(double number, TempScale scale) {
        this.number = number;
        this.scale = scale;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setScale(TempScale scale) {
        this.scale = scale;
    }

    public TempScale getScale() {
        return scale;
    }
}
