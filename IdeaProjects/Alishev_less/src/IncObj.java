public class IncObj {
    public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();
    car1.setModel("Yeti");
    car1.setBrend("Scoda");
    car1.setDateOfSince(1981);
    System.out.println("Поздравляем с вашей покупкой - " + car1.getBrend() + " " + car1.getModel() + " " + car1.getDateOfSince());
    }
}

class Car {
    private String brend;
    private String model;
    private int dateOfSince;
    public void setBrend(String uBrend) {
        brend = uBrend;
    }
    public String getBrend () {
        return brend;
    }
    public void setModel(String uModel) {
        model = uModel;
    }
    public String getModel () {
        return model;
    }
    public void setDateOfSince(int uDateOfSince) {
        dateOfSince = uDateOfSince;
    }
    public int getDateOfSince () {
        return dateOfSince;
    }
}
