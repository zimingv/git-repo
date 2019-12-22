public class Organization {
    private String name;
    private int cash;
    private boolean commerc;

    public void setName(String name) {
        if (!name.equals("")) {
            System.out.println("Введите имя");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setCash(int cash) {
        if (cash < 0) {
            System.out.println("Баланс не может быть отрицательным!");
        } else {
            this.cash = cash;
        }
    }

    public int getCash() {
        return cash;
    }

    public void setCommerc(boolean commerc) {
        this.commerc = commerc;
    }


    public boolean getCommerc() {
        return commerc;
    }

    public void dislplay() {
        System.out.println("Наименование компании - " + getName());
        System.out.println("Баланс расчетного счета = " + getCash());
        System.out.println("Коммерческого типа - " + getCommerc());
    }

    public int getTax(int taxRate) {
        return cash * taxRate / 100;
    }
}
